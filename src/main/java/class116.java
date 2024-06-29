import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class class116 {

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field2081 = 0;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Lme;")
    public static class44 field2085 = null;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "Lia;")
    public static class257 field2088 = class28.method234(-13, "Art");

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public int field2087;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public int field2091;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Ljava/awt/Image;")
    public Image field2090;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "[I")
    public int[] field2084;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZIIILjava/awt/Graphics;)V")
    public abstract void method824(int arg0, boolean arg1, int arg2, int arg3, int arg4, Graphics arg5);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
    public abstract void method825(int arg0, int arg1, Component arg2, boolean arg3);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IJIB)Z")
    public static final boolean method826(int arg0, long arg1, int arg2, byte arg3) {
        field2089++;
        if (arg3 <= 63) {
            field2085 = null;
        }
        int var5 = ((int) arg1 & 0x7E839) >> 14;
        int var6 = (int) arg1 >> 20 & 0x3;
        int var7 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class233 var8 = class5.method96(var7, false);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var10 = var8.field3950;
                var9 = var8.field3986;
            } else {
                var9 = var8.field3950;
                var10 = var8.field3986;
            }
            int var11 = var8.field3989;
            if (var6 != 0) {
                var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
            }
            class178.method1199(class137.field2441.field4119[0], (byte) 114, arg0, 0, var10, var11, arg2, class137.field2441.field4182[0], 0, true, 2, var9);
        } else {
            class178.method1199(class137.field2441.field4119[0], (byte) 124, arg0, var5 + 1, 0, 0, arg2, class137.field2441.field4182[0], var6, true, 2, 0);
        }
        class112.field2045 = 0;
        class81.field1570 = 2;
        class180.field3123 = class74.field1430;
        class123.field2210 = class105.field1952;
        return true;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public final void method827(byte arg0) {
        if (arg0 != -124) {
            this.method827((byte) 72);
        }
        field2082++;
        class23.method200(this.field2084, this.field2091, this.field2087);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static void method828(int arg0) {
        if (arg0 < -7) {
            field2088 = null;
            field2085 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BII)I")
    public static final int method829(byte arg0, int arg1, int arg2) {
        field2092++;
        if (arg0 > -95) {
            method828(98);
        }
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method830(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
    protected class116() {
    }
}
