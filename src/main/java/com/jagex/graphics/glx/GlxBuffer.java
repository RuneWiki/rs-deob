package com.jagex.graphics.glx;

import com.jagex.graphics.GpuBuffer;
import deob.ObfuscatedName;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

@ObfuscatedName("rv")
public abstract class GlxBuffer implements GpuBuffer {

    @ObfuscatedName("rv.m")
    public final GlxToolkit field4988;

    @ObfuscatedName("rv.k")
    public final int field4989;

    @ObfuscatedName("rv.f")
    public final boolean field4990;

    @ObfuscatedName("rv.w")
    public int field4987 = -1;

    @ObfuscatedName("rv.l")
    public int field4992;

    @ObfuscatedName("rv.u")
    public int field4991;

    @ObfuscatedName("rv.z")
    public NativeHeapBuffer field4986;

    @ObfuscatedName("rv.p")
    public static final int[] field4995 = new int[1];

    public GlxBuffer(GlxToolkit arg0, int arg1, boolean arg2) {
        this.field4988 = arg0;
        this.field4989 = arg1;
        this.field4990 = arg2;
    }

    @ObfuscatedName("rv.j()V")
    public void method7654() {
        if (this.field4987 >= 0) {
            return;
        }
        if (this.field4988.hasVertexBufferObject) {
            OpenGL.glGenBuffersARB(1, field4995, 0);
            this.field4987 = field4995[0];
            OpenGL.glBindBufferARB(this.field4989, this.field4987);
        } else {
            this.field4987 = 0;
        }
    }

    @ObfuscatedName("rv.k()I")
    public int method5743() {
        return this.field4992;
    }

    @ObfuscatedName("rv.t()J")
    public long getAddress() {
        return this.field4987 == 0 ? this.field4986.method50() : 0L;
    }

    @ObfuscatedName("rv.ae()V")
    public void method7658() {
        if (this.field4988.hasVertexBufferObject) {
            OpenGL.glBindBufferARB(this.field4989, this.field4987);
        }
    }

    @ObfuscatedName("rv.a(I)V")
    public void method5831(int arg0) {
        if (arg0 > this.field4991) {
            this.method7654();
            if (this.field4987 > 0) {
                OpenGL.glBindBufferARB(this.field4989, this.field4987);
                OpenGL.glBufferDataARBub(this.field4989, arg0, null, 0, this.field4990 ? 35040 : 35044);
                this.field4988.field10053 += arg0 - this.field4991;
            } else {
                this.field4986 = this.field4988.createHeapBuffer(arg0, false);
            }
            this.field4991 = arg0;
        }
        this.field4992 = arg0;
    }

    @ObfuscatedName("rv.w(II)J")
    public long lock(int arg0, int arg1) {
        OpenGL.glBindBufferARB(this.field4989, this.field4987);
        return OpenGL.glMapBufferARB(this.field4989, 35001) + (long) arg0;
    }

    @ObfuscatedName("rv.l()V")
    public void unlock() {
        OpenGL.glUnmapBufferARB(this.field4989);
    }

    @ObfuscatedName("rv.f(IIJ)Z")
    public boolean upload(int arg0, int arg1, long arg2) {
        this.method7654();
        if (this.field4987 > 0) {
            OpenGL.glBindBufferARB(this.field4989, this.field4987);
            OpenGL.glBufferSubDataARBa(this.field4989, arg0, arg1, arg2);
        } else {
            this.field4986.field413.copy(this.field4986.method50() + (long) arg0, arg2, arg1);
        }
        return true;
    }

    @ObfuscatedName("rv.m()V")
    public void delete() {
        if (this.field4987 > 0) {
            this.field4988.method19072(this.field4987, this.field4992);
            this.field4987 = -1;
        }
    }

    public void finalize() throws Throwable {
        this.delete();
        super.finalize();
    }
}
