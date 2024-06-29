import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public abstract class class14 {

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "[J")
    public static long[] field244 = new long[100];

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "[I")
    public static int[] field249 = new int[100];

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field248 = 0;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field251 = 0;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "Lje;")
    private static class67 field253 = class85.method592(255, "FULL");

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "Lje;")
    public static class67 field242 = field253;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field250 = 0;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "Lje;")
    private static class67 field247 = class85.method592(255, "This world is full)3");

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "Lje;")
    public static class67 field243 = field247;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public int field252;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    public int field257;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "Lua;")
    public static class140 field255;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field245;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "[I")
    public int[] field256;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "[Lqb;")
    public static class113[] field240;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/awt/Graphics;ZIIII)V")
    public abstract void method97(Graphics arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static void method98(byte arg0) {
        field240 = null;
        field253 = null;
        field247 = null;
        field244 = null;
        field249 = null;
        int var1 = 122 % ((arg0 - 10) / 54);
        field242 = null;
        field255 = null;
        field243 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILfd;I)[Lqb;")
    public static final class113[] method99(int arg0, int arg1, class40 arg2, int arg3) {
        if (arg0 != 100) {
            field249 = null;
        }
        field258++;
        return class150.method1149(arg2, arg0 - 222, arg1, arg3) ? class82.method582(arg0 - 27535) : null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method100(int arg0, int arg1, int arg2, Component arg3);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)Lvf;")
    public static final class152 method101(int arg0, int arg1) {
        class152 var2 = (class152) class56.field1130.method764((long) arg0, arg1 ^ 0x798);
        field241++;
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 23022) {
            field247 = null;
        }
        byte[] var3 = class104.field2380.method267((byte) -124, arg0, 8);
        class152 var4 = new class152();
        if (var3 != null) {
            var4.method1159((byte) 106, new class91(var3));
        }
        class56.field1130.method765((long) arg0, var4, (byte) -105);
        return var4;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZILjava/awt/Graphics;I)V")
    public abstract void method102(boolean arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)V")
    public final void method103(byte arg0) {
        field259++;
        if (arg0 < 66) {
            this.method97(null, false, 28, 16, 62, 10);
        }
        class8.method73(this.field256, this.field257, this.field252);
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
    protected class14() {
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIILnc;)V")
    public static final void method104(int arg0, int arg1, int arg2, int arg3, class93 arg4) {
        field254++;
        if (class86.field1903 >= 50 || class129.field2842 == 0 || (arg4.field2085 == null || arg4.field2085.length <= arg0)) {
            return;
        }
        int var5 = arg4.field2085[arg0];
        if (var5 == 0) {
            return;
        }
        int var6 = var5 >> 8;
        class59.field1174[class86.field1903] = var6;
        int var7 = var5 >> 4 & 0x7;
        if (arg3 > -124) {
            field248 = 19;
        }
        int var8 = (arg1 - 64) / 128;
        int var9 = var5 & 0xF;
        int var10 = (arg2 - 64) / 128;
        class127.field2783[class86.field1903] = var7;
        class129.field2845[class86.field1903] = 0;
        class80.field1767[class86.field1903] = null;
        class145.field3352[class86.field1903] = (var10 << 8) + (var8 << 16) + var9;
        class86.field1903++;
    }
}
