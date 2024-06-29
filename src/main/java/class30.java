import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class30 {

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public int field892 = 0;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public int field905 = 0;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Lwd;")
    public static class150 field898 = class2.method9(true, "Freunde");

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static volatile int field900 = 0;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field904 = 0;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "[I")
    public static int[] field893 = new int[200];

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Lwd;")
    private static class150 field894 = class2.method9(true, "Enter name of player to add to list");

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "Lwd;")
    public static class150 field908 = class2.method9(true, ")3runescape)3com");

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "Lwd;")
    private static class150 field907 = class2.method9(true, "wishes to duel with you)3");

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "Lwd;")
    public static class150 field890 = field907;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "Lwd;")
    public static class150 field897 = field894;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public int field888;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public int field891;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public int field895;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public int field896;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public int field899;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public int field901;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public int field902;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public int field906;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public int field909;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "I")
    public int field914;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "Lce;")
    public static class20 field912;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Le;")
    public class29 field889;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "[Lqd;")
    public static class114[] field903;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)Z")
    public static final boolean method243(int arg0, int arg1, int arg2, int arg3) {
        field911++;
        int var4 = class111.field2548.method904(class17.field466, arg3, arg0, arg2);
        int var5 = arg2 >> 14 & 0x7FFF;
        if (var4 == -1) {
            return false;
        }
        int var6 = var4 & 0x1F;
        int var7 = var4 >> 6 & 0x3;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class61 var8 = class20.method145(var5, (byte) -88);
            int var9;
            int var10;
            if (var7 == 0 || var7 == 2) {
                var10 = var8.field1571;
                var9 = var8.field1563;
            } else {
                var9 = var8.field1571;
                var10 = var8.field1563;
            }
            int var11 = var8.field1544;
            if (var7 != 0) {
                var11 = (var11 << var7 & 0xF) + (var11 >> 4 - var7);
            }
            class17.method124(class46.field1244.field2934[0], 0, 2, var11, 0, 126, var9, var10, arg0, arg3, true, class46.field1244.field2963[0]);
        } else {
            class17.method124(class46.field1244.field2934[0], var6 + 1, 2, 0, var7, 127, 0, 0, arg0, arg3, true, class46.field1244.field2963[0]);
        }
        class3.field64 = class14.field370;
        class63.field1635 = class131.field3098;
        class76.field1892 = arg1;
        class90.field2094 = 2;
        return true;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public static void method244(byte arg0) {
        if (arg0 >= -110) {
            method246((byte) 59, true);
        }
        field912 = null;
        field908 = null;
        field897 = null;
        field898 = null;
        field894 = null;
        field907 = null;
        field893 = null;
        field890 = null;
        field903 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)V")
    public static final void method245(byte arg0, int arg1) {
        field887++;
        class38.field1047 = arg1;
        if (arg0 != 8) {
            field903 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BZ)V")
    public static final void method246(byte arg0, boolean arg1) {
        field886++;
        if (class58.field1496 == null) {
            return;
        }
        try {
            class148 var2 = new class148(4);
            var2.method1126(31159, arg1 ? 2 : 3);
            var2.method1128(0, (byte) -98);
            if (arg0 == -77) {
                class58.field1496.method122(0, var2.field3592, (byte) 4, 4);
            }
        } catch (IOException var4) {
            try {
                class58.field1496.method121((byte) -117);
            } catch (Exception var3) {
            }
            class134.field3158++;
            class58.field1496 = null;
        }
    }
}
