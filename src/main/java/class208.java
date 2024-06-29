import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class208 extends class143 {

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "[I")
    public static int[] field3196 = new int[14];

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "I")
    public static int field3205 = 0;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "J")
    public static long field3210 = -1L;

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3204 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "Ljava/lang/String;")
    public String field3198;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "[C")
    public char[] field3206;

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "[C")
    public char[] field3209;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "[I")
    public int[] field3201;

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "[I")
    public int[] field3207;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lek;I)V", line = 5)
    public final void method1435(class465 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2705(-43);
            if (var3 == 0) {
                field3197++;
                if (arg1 != 20906) {
                    method1439((byte) 71);
                    return;
                }
                return;
            }
            this.method1437(var3, arg1 - 20790, arg0);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(CI)I", line = 29)
    public final int method1436(char arg0, int arg1) {
        field3200++;
        if (this.field3201 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg1 != -5807) {
            return -121;
        }
        while (this.field3201.length > var3) {
            if (this.field3206[var3] == arg0) {
                return this.field3201[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILek;)V", line = 58)
    private final void method1437(int arg0, int arg1, class465 arg2) {
        if (arg0 == 1) {
            this.field3198 = arg2.method2717(true);
        } else if (arg0 == 2) {
            int var7 = arg2.method2705(-128);
            this.field3207 = new int[var7];
            this.field3209 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3207[var8] = arg2.method2755((byte) -81);
                byte var9 = arg2.method2712(-105);
                this.field3209[var8] = var9 == 0 ? 0 : class409.method2446(var9, -18082);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method2705(-107);
            this.field3201 = new int[var4];
            this.field3206 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3201[var5] = arg2.method2755((byte) -68);
                byte var6 = arg2.method2712(-88);
                this.field3206[var5] = var6 == 0 ? 0 : class409.method2446(var6, -18082);
            }
        }
        if (arg1 < 25) {
            field3196 = null;
        }
        field3199++;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V", line = 121)
    public final void method1438(int arg0) {
        if (this.field3201 != null) {
            for (int var2 = 0; var2 < this.field3201.length; var2++) {
                this.field3201[var2] = class460.method2676(this.field3201[var2], 32768);
            }
        }
        field3203++;
        if (arg0 == -14551 && this.field3207 != null) {
            for (int var3 = 0; var3 < this.field3207.length; var3++) {
                this.field3207[var3] = class460.method2676(this.field3207[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(B)V", line = 151)
    public static void method1439(byte arg0) {
        int var1 = 35 / ((5 - arg0) / 44);
        field3196 = null;
        field3204 = null;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(CZ)I", line = 168)
    public final int method1440(char arg0, boolean arg1) {
        field3202++;
        if (this.field3207 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field3207.length; var3++) {
            if (this.field3209[var3] == arg0) {
                return this.field3207[var3];
            }
        }
        if (!arg1) {
            this.field3201 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)I", line = 203)
    public static final int method1441(boolean arg0) {
        field3208++;
        if (class512.field7616 == null) {
            if (!class324.field4519 && class400.field5784 > 0) {
                if (class577.field8449 && class236.field3494.method668(-115, 81) && class400.field5784 > 2) {
                    return ((class673) class150.field2533.field9799.field6258.field6258).field9548;
                }
                return ((class673) class150.field2533.field9799.field6258).field9548;
            }
            int var1 = class313.field4336.method310(false);
            int var2 = class313.field4336.method321(125);
            int var3 = class150.field2534;
            int var4 = class485.field6918;
            int var5 = class69.field1093;
            if (var3 < var1 && var1 < var3 + var5) {
                int var6 = -1;
                for (int var7 = 0; var7 < class400.field5784; var7++) {
                    if (client.field1383) {
                        int var11 = var4 + ((-var7 + -1 + class400.field5784) * 16) + 33;
                        if (var11 - 13 < var2 && (var11 + 3) >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = var4 + ((class400.field5784 - var7 - 1) * 16) + 31;
                        if (var2 > (var12 - 13) && var12 + 3 >= var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class366 var9 = new class366(class150.field2533);
                    for (class673 var10 = (class673) var9.method2196(-1); var10 != null; var10 = (class673) var9.method2199((byte) -68)) {
                        if (var6 == (var8++)) {
                            return var10.field9548;
                        }
                    }
                }
            }
        }
        if (arg0) {
            field3204 = null;
        }
        return -1;
    }
}
