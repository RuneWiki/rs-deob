import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public abstract class class119 {

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public int field1749;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public int field1745;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public int field1747;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "Lei;")
    public static class169 field1748 = class66.method452(125);

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "Z")
    public static boolean field1752 = false;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "[Z")
    public static boolean[] field1753 = new boolean[100];

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static void method816(int arg0) {
        field1748 = null;
        field1753 = null;
        if (arg0 != -14650) {
            method816(-1);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IBIIII)V")
    public static final void method817(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field1744++;
        if (arg1 != -83) {
            method816(38);
        }
        for (int var6 = arg3; var6 <= arg4; var6++) {
            class183.method1181(arg0, (byte) -69, arg5, class163.field2370[var6], arg2);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILve;I)[Lvd;")
    public static final class117[] method818(int arg0, class233 arg1, int arg2) {
        field1746++;
        int var3 = -60 % ((arg2 + 16) / 34);
        return class255.method1711(arg1, true, arg0) ? class45.method302(29713) : null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLvi;I)V")
    public static final void method819(byte arg0, class5 arg1, int arg2) {
        if (arg1.field76 > class82.field1267) {
            class155.method1049((byte) 82, arg1);
        } else if (class82.field1267 <= arg1.field93) {
            class92.method627(false, arg1);
        } else {
            class82.method545(arg1, -73);
        }
        field1750++;
        if (arg1.field45 < 128 || arg1.field94 < 128 || arg1.field45 >= 13184 || arg1.field94 >= 13184) {
            arg1.field93 = 0;
            arg1.field76 = 0;
            arg1.field81 = -1;
            arg1.field98 = -1;
            arg1.field45 = arg1.field119[0] * 128 + (arg1.method57(0) * 64);
            arg1.field94 = arg1.field50[0] * 128 + arg1.method57(0) * 64;
            arg1.method72((byte) -115);
        }
        if (class55.field847 == arg1 && (arg1.field45 < 1536 || arg1.field94 < 1536 || arg1.field45 >= 11776 || arg1.field94 >= 11776)) {
            arg1.field76 = 0;
            arg1.field81 = -1;
            arg1.field98 = -1;
            arg1.field93 = 0;
            arg1.field45 = arg1.field119[0] * 128 + arg1.method57(0) * 64;
            arg1.field94 = arg1.field50[0] * 128 + arg1.method57(0) * 64;
            arg1.method72((byte) -91);
        }
        class260.method1742(arg1, 1024);
        int var3 = -109 % ((78 - arg0) / 46);
        class114.method740(255, arg1);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)V")
    public abstract void method310(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(III)V")
    public class119(int arg0, int arg1, int arg2) {
        this.field1749 = arg1;
        this.field1745 = arg0;
        this.field1747 = arg2;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IBI)V")
    public abstract void method311(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(III)V")
    public abstract void method313(int arg0, int arg1, int arg2);
}
