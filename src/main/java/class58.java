import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class58 {

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "[I")
    public static int[] field1225 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "Lud;")
    public static class279 field1231 = class130.method1024("RuneScape wird geladen )2 bitte warten)3)3)3", 255);

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "[Lcg;")
    public static class42[] field1233 = new class42[0];

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    private int field1228;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public int field1232;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public int field1234;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lvh;II)V", line = 7)
    public final void method524(class53 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method483(-122);
            if (var4 == 0) {
                field1230++;
                if (arg2 != -1) {
                    this.method524((class53) null, 127, 10);
                }
                return;
            }
            this.method528(var4, -98, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[Ljava/lang/Object;[JII)V", line = 30)
    public static final void method525(int arg0, Object[] arg1, long[] arg2, int arg3, int arg4) {
        if (arg0 < 118) {
            method525(-4, (Object[]) null, (long[]) null, -41, -18);
        }
        field1224++;
        if (arg3 >= arg4) {
            return;
        }
        int var5 = (arg3 + arg4) / 2;
        int var6 = arg3;
        long var7 = arg2[var5];
        arg2[var5] = arg2[arg4];
        arg2[arg4] = var7;
        Object var9 = arg1[var5];
        arg1[var5] = arg1[arg4];
        arg1[arg4] = var9;
        for (int var10 = arg3; var10 < arg4; var10++) {
            if (arg2[var10] < ((long) (var10 & 0x1) + var7)) {
                long var11 = arg2[var10];
                arg2[var10] = arg2[var6];
                arg2[var6] = var11;
                Object var13 = arg1[var10];
                arg1[var10] = arg1[var6];
                arg1[var6++] = var13;
            }
        }
        arg2[arg4] = arg2[var6];
        arg2[var6] = var7;
        arg1[arg4] = arg1[var6];
        arg1[var6] = var9;
        method525(120, arg1, arg2, arg3, var6 - 1);
        method525(120, arg1, arg2, var6 + 1, arg4);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V", line = 83)
    public static void method526(byte arg0) {
        field1233 = null;
        field1225 = null;
        if (arg0 == -80) {
            field1231 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)Lbn;", line = 95)
    public final class66 method527(boolean arg0) {
        field1223++;
        class66 var2 = (class66) class210.field3697.method1336((long) this.field1228, 0);
        if (arg0) {
            this.field1228 = -4;
        }
        if (var2 != null) {
            return var2;
        }
        class66 var3 = class216.method1583(122, 0, class51.field1062, this.field1228);
        if (var3 != null) {
            class210.field3697.method1331(var3, 30237, (long) this.field1228);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILvh;I)V", line = 126)
    private final void method528(int arg0, int arg1, class53 arg2, int arg3) {
        if (arg0 == 1) {
            this.field1228 = arg2.method468(28214);
        } else if (arg0 == 2) {
            this.field1234 = arg2.method483(-107);
            this.field1232 = arg2.method483(-124);
        }
        field1229++;
        int var5 = -104 % ((arg1 - 90) / 35);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lvh;B)Lud;", line = 159)
    public static final class279 method529(class53 arg0, byte arg1) {
        field1226++;
        if (arg1 != -34) {
            method525(67, (Object[]) null, (long[]) null, 42, -58);
        }
        return class237.method1711(0, 32767, arg0);
    }
}
