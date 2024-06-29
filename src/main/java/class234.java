import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class234 extends class163 {

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "[Loa;")
    public static class302[] field4006 = new class302[28];

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "Lij;")
    public static class175 field4003 = new class175();

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public int field3996;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "I")
    public int field3998;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
    public int field3999;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    public int field4000;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "I")
    public int field4001;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "I")
    public int field4002;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "I")
    public int field4005;

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "I")
    public int field4007;

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "I")
    public int field4009;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "I")
    public int field4010;

    @OriginalMember(owner = "client!nl", name = "H", descriptor = "I")
    public int field4011;

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "I")
    public int field4012;

    @OriginalMember(owner = "client!nl", name = "J", descriptor = "I")
    public int field4013;

    @OriginalMember(owner = "client!nl", name = "K", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!nl", name = "L", descriptor = "I")
    public int field4015;

    @OriginalMember(owner = "client!nl", name = "O", descriptor = "I")
    public int field4018;

    @OriginalMember(owner = "client!nl", name = "P", descriptor = "I")
    public int field4019;

    @OriginalMember(owner = "client!nl", name = "Q", descriptor = "I")
    public int field4020;

    @OriginalMember(owner = "client!nl", name = "N", descriptor = "Lbb;")
    public class133 field4017;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "Lah;")
    public class157 field4008;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "Lof;")
    public class268 field4004;

    @OriginalMember(owner = "client!nl", name = "M", descriptor = "Lpb;")
    public class285 field4016;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V", line = 13)
    public final void method1583(byte arg0) {
        this.field4017 = null;
        field4014++;
        this.field4016 = null;
        this.field4008 = null;
        this.field4004 = null;
        if (arg0 != -13) {
            this.field4016 = (class285) null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZLgg;)V", line = 52)
    public static final void method1584(boolean arg0, class67 arg1) {
        field3997++;
        if (class45.field840 == arg1.field1216 || arg1.field1202 == -1 || arg1.field1196 != 0 || arg1.field1214 + 1 > class250.method1682(arg1.field1202, true).field2064[arg1.field1231]) {
            int var2 = arg1.field1216 - arg1.field1212;
            int var3 = class45.field840 - arg1.field1212;
            int var4 = arg1.field1217 * 128 + arg1.method515(5373952) * 64;
            int var5 = arg1.field1200 * 128 + (arg1.method515(5373952) * 64);
            int var6 = arg1.field1237 * 128 + (arg1.method515(5373952) * 64);
            int var7 = arg1.field1207 * 128 + (arg1.method515(5373952) * 64);
            arg1.field1197 = ((var2 - var3) * var5 + var3 * var7) / var2;
            arg1.field1192 = ((var2 - var3) * var4 + var3 * var6) / var2;
        }
        if (arg1.field1252 == 0) {
            arg1.field1213 = 1024;
        }
        arg1.field1204 = 0;
        if (arg1.field1252 == 1) {
            arg1.field1213 = 1536;
        }
        if (arg1.field1252 == 2) {
            arg1.field1213 = 0;
        }
        if (arg1.field1252 == 3) {
            arg1.field1213 = 512;
        }
        arg1.field1191 = arg1.field1213;
        if (!arg0) {
            method1584(true, (class67) null);
        }
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)V", line = 105)
    public static void method1585(int arg0) {
        field4003 = null;
        if (arg0 == -1) {
            field4006 = null;
        }
    }
}
