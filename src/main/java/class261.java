import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public abstract class class261 {

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "Loh;")
    public static class258 field4533 = class153.method1046("Untersuchen", 119);

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "Lvj;")
    public static class96 field4539 = new class96(128);

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field4540 = 0;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public int field4536;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public int field4537;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "Ljava/awt/Image;")
    public Image field4535;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "[I")
    public int[] field4531;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BI)I", line = 13)
    public static final int method1832(byte arg0, int arg1) {
        field4538++;
        if (arg0 < 12) {
            field4539 = (class96) null;
        }
        return (arg1 & 0x3FACE) >> 11;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZLva;)Loh;", line = 27)
    public static final class258 method1833(boolean arg0, class235 arg1) {
        if (arg0) {
            method1832((byte) 6, 25);
        }
        field4534++;
        return class38.method293(32767, 0, arg1);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)J", line = 39)
    public static final long method1834(int arg0, int arg1, int arg2) {
        class228 var3 = class178.field3180[arg0][arg1][arg2];
        return var3 == null || var3.field3923 == null ? 0L : var3.field3923.field298;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V", line = 57)
    public static void method1835(byte arg0) {
        field4539 = null;
        field4533 = null;
        if (arg0 > -58) {
            field4540 = 111;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 72)
    public final void method1836(int arg0) {
        if (arg0 != 6932) {
            field4539 = (class96) null;
        }
        class211.method1413(this.field4531, this.field4536, this.field4537);
        field4532++;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V", line = 84)
    protected class261() {
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILjava/awt/Graphics;BIII)V")
    public abstract void method783(int arg0, Graphics arg1, byte arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIBLjava/awt/Component;)V")
    public abstract void method784(int arg0, int arg1, byte arg2, Component arg3);

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method785(int arg0, int arg1, int arg2, Graphics arg3);
}
