import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public abstract class class400 extends class402 {

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public int field5858;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public int field5857;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public int field5860;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public int field5863;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field5855 = -1;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field5853 = -1;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "[Z")
    public static boolean[] field5862 = new boolean[100];

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Z")
    public static boolean field5859 = true;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field5854 = 0;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field5861 = 0;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "Lir;")
    public static class185 field5865;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "Z")
    public static boolean field5864;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIBI)I", line = 5)
    public static final int method2567(int arg0, int arg1, byte arg2, int arg3) {
        field5866++;
        int var4 = -16 / ((87 - arg2) / 39);
        if (arg0 > arg3) {
            return arg0;
        } else if (arg1 >= arg3) {
            return arg3;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)V", line = 16)
    public static final void method2568(int arg0, int arg1) {
        field5856++;
        if (arg1 != -1) {
            field5861 = -56;
        }
        class51 var2 = class219.field3053;
        synchronized (class219.field3053) {
            class219.field3053.method379(arg0, false);
        }
        class51 var3 = class269.field3986;
        synchronized (class269.field3986) {
            class269.field3986.method379(arg0, false);
        }
        class51 var4 = class322.field4795;
        synchronized (class322.field4795) {
            class322.field4795.method379(arg0, false);
        }
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)V", line = 44)
    public static void method2569(int arg0) {
        field5865 = null;
        field5862 = null;
        if (arg0 != -20716) {
            field5864 = false;
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(IIII)V", line = 73)
    public class400(int arg0, int arg1, int arg2, int arg3) {
        this.field5858 = arg3;
        this.field5857 = arg1;
        this.field5860 = arg2;
        this.field5863 = arg0;
    }
}
