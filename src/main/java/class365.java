import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ija")
public class class365 extends class379 {

    @OriginalMember(owner = "client!ija", name = "h", descriptor = "I")
    public int field4537;

    @OriginalMember(owner = "client!ija", name = "i", descriptor = "Llja;")
    public static class744 field4538 = new class744(53, 6);

    @OriginalMember(owner = "client!ija", name = "l", descriptor = "Lhj;")
    public static class596 field4541 = new class596(7, 4);

    @OriginalMember(owner = "client!ija", name = "m", descriptor = "Lut;")
    public static class136 field4542 = new class136();

    @OriginalMember(owner = "client!ija", name = "j", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!ija", name = "k", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "([Ljava/lang/String;III[I)V", line = 5)
    public static final void method2130(String[] arg0, int arg1, int arg2, int arg3, int[] arg4) {
        if (arg1 < arg3) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg1;
            String var7 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var7;
            int var8 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var8;
            for (int var9 = arg1; var9 < arg3; var9++) {
                if (var7 == null || arg0[var9] != null && arg0[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    int var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg0[arg3] = arg0[var6];
            arg0[var6] = var7;
            arg4[arg3] = arg4[var6];
            arg4[var6] = var8;
            method2130(arg0, arg1, arg2, var6 - 1, arg4);
            method2130(arg0, var6 + 1, -13, arg3, arg4);
        }
        field4539++;
        if (arg2 != -13) {
            method2131((byte) -96);
        }
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(B)V", line = 59)
    public static final void method2131(byte arg0) {
        if (arg0 >= -46) {
            method2131((byte) 48);
        }
        field4540++;
        if (class289.field3493 == 9) {
            class48.method454(5, -1);
        } else if (class289.field3493 == 5 || class289.field3493 == 6) {
            class48.method454(3, -1);
            return;
        } else if (class289.field3493 == 12) {
            class48.method454(3, -1);
            return;
        }
    }

    @OriginalMember(owner = "client!ija", name = "<init>", descriptor = "()V", line = 85)
    public class365() {
    }

    @OriginalMember(owner = "client!ija", name = "<init>", descriptor = "(I)V", line = 92)
    public class365(int arg0) {
        this.field4537 = arg0;
    }

    @OriginalMember(owner = "client!ija", name = "b", descriptor = "(B)V", line = 100)
    public static void method2132(byte arg0) {
        field4542 = null;
        if (arg0 != 126) {
            field4542 = null;
        }
        field4538 = null;
        field4541 = null;
    }
}
