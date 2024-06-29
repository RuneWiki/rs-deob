import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public class class242 extends class220 {

    @OriginalMember(owner = "client!uha", name = "y", descriptor = "I")
    public int field3238;

    @OriginalMember(owner = "client!uha", name = "v", descriptor = "I")
    public int field3235;

    @OriginalMember(owner = "client!uha", name = "t", descriptor = "I")
    public static int field3233 = 0;

    @OriginalMember(owner = "client!uha", name = "u", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!uha", name = "w", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!uha", name = "x", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!uha", name = "<init>", descriptor = "(Ldp;Lfv;IIIIIIIIII)V")
    public class242(class3 arg0, class120 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field3238 = arg10;
        this.field3235 = arg11;
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(Z)Lg;")
    public final class153 method769(boolean arg0) {
        if (arg0) {
            method1547(109, null);
        }
        field3237++;
        return class481.field6798;
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(ILs;)V")
    public static final void method1547(int arg0, class278 arg1) {
        class459.field6474[arg0] = arg1;
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(IILha;)V")
    public static final void method1548(int arg0, int arg1, class58 arg2) {
        field3236++;
        if (!class734.field10226 || !class377.field5290) {
            class213.field2813 = 0;
            return;
        }
        if (class597.field8399) {
            class315.field4365 = class415.field5856.method2001(false);
        }
        class125.field1522 = 0;
        class606.field8531 = 0;
        class354.field5057 = 0;
        int[] var3 = arg2.method395();
        class123.field1473 = (int) ((float) var3[3] / 3.0F);
        class44.field540 = (int) ((float) var3[2] / 3.0F);
        arg2.method420(class228.field3068);
        if (((int) ((float) class228.field3068[0] / 3.0F)) != class454.field6415 || (int) ((float) class228.field3068[1] / 3.0F) != class240.field3200) {
            class454.field6415 = (int) ((float) class228.field3068[0] / 3.0F);
            class240.field3200 = (int) ((float) class228.field3068[1] / 3.0F);
            class246.field3285 = new int[class454.field6415 * class240.field3200];
            class194.field2592 = class240.field3200 >> 1;
            class674.field9144 = class454.field6415 >> 1;
        }
        class654.field8979 = arg2.method436();
        class213.field2813 = 0;
        for (int var4 = 0; var4 < class556.field7801; var4++) {
            class66.method548(arg2, arg0, (byte) 95, class491.field6930[var4]);
        }
        for (int var5 = 0; var5 < class593.field8350; var5++) {
            class66.method548(arg2, arg0, (byte) 79, class642.field8800[var5]);
        }
        for (int var6 = 0; var6 < class626.field8702; var6++) {
            class66.method548(arg2, arg0, (byte) 124, class21.field319[var6]);
        }
        class744.field10348 = 0;
        if (class213.field2813 > arg1) {
            int var7 = class246.field3285.length;
            int var8 = var7 - var7 & 0x7;
            int var9 = 0;
            while (var9 < var8) {
                class246.field3285[var9++] = Integer.MAX_VALUE;
                class246.field3285[var9++] = Integer.MAX_VALUE;
                class246.field3285[var9++] = Integer.MAX_VALUE;
                class246.field3285[var9++] = Integer.MAX_VALUE;
                class246.field3285[var9++] = Integer.MAX_VALUE;
                class246.field3285[var9++] = Integer.MAX_VALUE;
                class246.field3285[var9++] = Integer.MAX_VALUE;
                class246.field3285[var9++] = Integer.MAX_VALUE;
            }
            while (var7 > var9) {
                class246.field3285[var9++] = Integer.MAX_VALUE;
            }
            class546.field7623 = 1;
            for (int var10 = 0; var10 < class213.field2813; var10++) {
                class104 var11 = class686.field9381[var10];
                class61.method526(var11.field1244[1], var11.field1247[0], var11.field1247[1], var11.field1244[3], var11.field1238[1], var11.field1247[3], var11.field1238[3], var11.field1238[0], (byte) -126, var11.field1244[0]);
                class61.method526(var11.field1244[2], var11.field1247[1], var11.field1247[2], var11.field1244[3], var11.field1238[2], var11.field1247[3], var11.field1238[3], var11.field1238[1], (byte) -126, var11.field1244[1]);
            }
            class546.field7623 = 2;
        }
        if (class597.field8399) {
            class5.field49 = class415.field5856.method2001(false) - class315.field4365;
        }
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(I)[Lbd;")
    public static final class60[] method1549(int arg0) {
        if (arg0 >= -72) {
            return null;
        } else {
            field3234++;
            return new class60[] { class639.field8788, class194.field2590, class174.field2355, class575.field8135, class263.field3792, class578.field8163, class134.field1953, class661.field9052, class94.field1103, class220.field2880, class54.field623, class614.field8602, class84.field1047, class133.field1951 };
        }
    }
}
