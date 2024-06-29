import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public abstract class class176 extends class166 {

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "Z")
    public boolean field2168 = false;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "Lea;")
    public static class547 field2173 = new class547(83, 20);

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "B")
    public byte field2167;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "B")
    public byte field2175;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public int field2165;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public int field2166;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public int field2169;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public int field2170;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    public int field2172;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "I")
    public int field2178;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "Lgg;")
    public class176 field2179;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "Lni;")
    public static class522 field2174;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "Z")
    public boolean field2164;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLha;)Loia;")
    public abstract class90 method134(byte arg0, class60 arg1);

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(Lha;I)Lbd;")
    public abstract class62 method127(class60 arg0, int arg1);

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILha;BI)Z")
    public abstract boolean method131(int arg0, class60 arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lha;B)Z")
    public abstract boolean method882(class60 arg0, byte arg1);

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(I)Z")
    public abstract boolean method123(int arg0);

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(I)Luca;")
    public static final class513 method1006(int arg0) {
        field2177++;
        if (class642.field8937 == null || class551.field7805 == null) {
            return null;
        }
        class513 var1 = (class513) class551.field7805.method1072(1000);
        int var2 = -107 % ((arg0 - 57) / 61);
        while (var1 != null) {
            class292 var3 = class642.field8929.method1647(123, var1.field6940);
            if (var3 != null && var3.field3875 && var3.method1736(35, class642.field8932)) {
                return var1;
            }
            var1 = (class513) class551.field7805.method1072(1000);
        }
        return null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I[Lcba;)I")
    public abstract int method881(int arg0, class551[] arg1);

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lgg;BZILha;II)V")
    public abstract void method162(class176 arg0, byte arg1, boolean arg2, int arg3, class60 arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(B)Z")
    public abstract boolean method157(byte arg0);

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(B)V")
    public static void method1007(byte arg0) {
        field2173 = null;
        if (arg0 <= -45) {
            field2174 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IBII)V")
    public static final void method1008(int arg0, byte arg1, int arg2, int arg3) {
        field2163++;
        class252 var4 = class150.method916(arg3, arg1 + 2, 11);
        var4.method1502((byte) -103);
        var4.field3251 = arg2;
        var4.field3247 = arg0;
        if (arg1 != -105) {
            method1007((byte) 8);
        }
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(Z)I")
    public abstract int method128(boolean arg0);

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)I")
    public int method130(int arg0) {
        if (arg0 != -14240) {
            this.method131(82, null, (byte) -22, -7);
        }
        field2171++;
        return 0;
    }

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "(I)Z")
    public abstract boolean method126(int arg0);

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(Lha;I)V")
    public abstract void method136(class60 arg0, int arg1);

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZ[Lcba;I)I")
    public final int method1009(int arg0, boolean arg1, class551[] arg2, int arg3) {
        field2176++;
        if (arg1) {
            this.method136(null, -104);
        }
        long var5 = class180.field2218[this.field2175][arg0][arg3];
        long var7 = 0L;
        int var9 = 0;
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            var7 += 16L;
            arg2[var9++] = class85.field1176[var10 - 1].field9295;
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg2[var11] = null;
        }
        return var9;
    }

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "(I)I")
    public abstract int method132(int arg0);

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(Z)Z")
    public abstract boolean method885(boolean arg0);

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "(B)V")
    public abstract void method150(byte arg0);
}
