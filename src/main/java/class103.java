import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class103 {

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "Lec;")
    public static class28 field2196 = class28.method210(-46, "headicons_prayer");

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field2193 = 0;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "Lec;")
    public static class28 field2199 = class28.method210(-46, "Importing maps )2 ");

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static volatile int field2202 = -1;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "Lec;")
    public static class28 field2201 = class28.method210(-46, "Loaded config");

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "Lec;")
    public static class28 field2206 = class28.method210(-46, "You have @gre@");

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "Lec;")
    public static class28 field2204 = class28.method210(-46, "Loaded update list");

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "Lvb;")
    public static class122 field2205;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "Lwc;")
    public static class128 field2197;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "[[I")
    public static int[][] field2195;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILjava/awt/Graphics;IILj;)V")
    public static final void method723(int arg0, int arg1, Graphics arg2, int arg3, int arg4, class54 arg5) {
        class62.field1379.method92((byte) -4);
        class80.field1843.method977(0, 0);
        field2192++;
        if (arg3 != -17962) {
            method726(-16, -78);
        }
        arg5.method433(class95.field2104, 55, 28, 16777215, true);
        if (arg0 == 0) {
            arg5.method433(class47.field1060, 55, 41, 65280, true);
        }
        if (arg0 == 1) {
            arg5.method433(class77.field1721, 55, 41, 16776960, true);
        }
        if (arg0 == 2) {
            arg5.method433(class11.field190, 55, 41, 16711680, true);
        }
        if (arg0 == 3) {
            arg5.method433(class90.field1989, 55, 41, 65535, true);
        }
        arg5.method433(class57.field1313, 184, 28, 16777215, true);
        if (arg4 == 0) {
            arg5.method433(class47.field1060, 184, 41, 65280, true);
        }
        if (arg4 == 1) {
            arg5.method433(class77.field1721, 184, 41, 16776960, true);
        }
        if (arg4 == 2) {
            arg5.method433(class11.field190, 184, 41, 16711680, true);
        }
        arg5.method433(class92.field2029, 324, 28, 16777215, true);
        if (arg1 == 0) {
            arg5.method433(class47.field1060, 324, 41, 65280, true);
        }
        if (arg1 == 1) {
            arg5.method433(class77.field1721, 324, 41, 16776960, true);
        }
        if (arg1 == 2) {
            arg5.method433(class11.field190, 324, 41, 16711680, true);
        }
        arg5.method433(class53.field1211, 458, 33, 16777215, true);
        class62.field1379.method91(0, arg2, 11675, 453);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V")
    public static final void method724(int arg0, int arg1) {
        field2198++;
        if (arg1 != -12527) {
            field2201 = null;
        }
        class12.method62(false, arg1 ^ 0xFFFF9866, arg0, 0, null);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
    public static void method725(boolean arg0) {
        field2201 = null;
        field2205 = null;
        field2195 = null;
        field2196 = null;
        field2197 = null;
        field2204 = null;
        if (!arg0) {
            field2196 = null;
        }
        field2199 = null;
        field2206 = null;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)I")
    public static final int method726(int arg0, int arg1) {
        field2207++;
        class51 var2 = class12.method67(arg1, false);
        int var3 = var2.field1197;
        int var4 = var2.field1189;
        int var5 = var2.field1192;
        int var6 = -8 % ((arg0 - 38) / 45);
        int var7 = class78.field1748[var4 - var5];
        return class36.field818[var3] >> var5 & var7;
    }
}
