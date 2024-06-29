import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class73 extends class160 {

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
    private final int field1207;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
    private final int field1213;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "I")
    private final int field1211;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "I")
    private final int field1217;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
    public static int field1203 = 0;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    public static int field1205 = 0;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "Lve;")
    public static class255 field1206 = class87.method607(71, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "Ltk;")
    public static class239 field1208;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "[B")
    public static byte[] field1202;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BII)V", line = 5)
    public final void method163(byte arg0, int arg1, int arg2) {
        field1214++;
        int var4 = 119 % ((arg0 - 28) / 63);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lrg;BII)Ldm;", line = 21)
    public static final class273 method526(class88 arg0, byte arg1, int arg2, int arg3) {
        field1215++;
        if (class96.method763((byte) 68, arg3, arg2, arg0)) {
            int var4 = 111 / ((23 - arg1) / 57);
            return class213.method1524((byte) 36);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 35)
    public static final void method527(int arg0) {
        class70.field1116.method553(123);
        if (arg0 < 74) {
            field1206 = (class255) null;
        }
        field1216++;
        class256.field4371.method553(-89);
        class14.field203.method553(-35);
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(IIIIIII)V", line = 48)
    public class73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1207 = arg2;
        this.field1213 = arg3;
        this.field1211 = arg1;
        this.field1217 = arg0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V", line = 70)
    public final void method160(int arg0, int arg1, int arg2) {
        field1209++;
        int var4 = this.field1217 * arg2 >> 12;
        if (arg0 == 0) {
            int var5 = this.field1207 * arg2 >> 12;
            int var6 = this.field1211 * arg1 >> 12;
            int var7 = this.field1213 * arg1 >> 12;
            class220.method1547(var6, var7, this.field2695, var4, (byte) 23, var5);
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(III)V", line = 93)
    public static final void method528(int arg0, int arg1, int arg2) {
        field1212++;
        class246 var3 = class196.method1401(arg1, 64);
        int var4 = var3.field4131;
        if (arg2 < 55) {
            return;
        }
        int var5 = var3.field4133;
        int var6 = var3.field4128;
        int var7 = class101.field1711[var6 - var5];
        if (arg0 < 0 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class190.method1309(class76.field1246[var4] & ~var8 | arg0 << var5 & var8, (byte) -99, var4);
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(III)V", line = 120)
    public final void method158(int arg0, int arg1, int arg2) {
        field1210++;
        if (arg0 != -30729) {
            return;
        }
        int var4 = this.field1217 * arg1 >> 12;
        int var5 = this.field1207 * arg1 >> 12;
        int var6 = this.field1211 * arg2 >> 12;
        int var7 = this.field1213 * arg2 >> 12;
        class72.method525(false, this.field2693, var5, var6, var4, this.field2699, var7, this.field2695);
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V", line = 150)
    public static void method529(int arg0) {
        field1208 = null;
        field1202 = null;
        field1206 = null;
        if (arg0 != 16777215) {
            method526((class88) null, (byte) 42, 92, -86);
        }
    }
}
