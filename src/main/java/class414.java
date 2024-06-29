import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class414 {

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "F")
    private float field5850 = 1.0F;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "F")
    private float field5856 = 0.25F;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "F")
    private float field5865 = 1.0F;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public int field5851;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "F")
    private float field5861;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    private int field5853;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "Lkv;")
    private class181 field5867;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    private int field5862;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "F")
    private float field5857;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
    public int field5869;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    private int field5860;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public int field5864;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "F")
    private float field5858;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field5859 = 64;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
    public static int field5868 = 0;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lnf;I)Z", line = 3)
    public final boolean method2471(class414 arg0, int arg1) {
        field5855++;
        if (arg1 == -1) {
            return this.field5853 == arg0.field5853 && this.field5858 == arg0.field5858 && this.field5861 == arg0.field5861 && this.field5857 == arg0.field5857 && this.field5856 == arg0.field5856 && this.field5865 == arg0.field5865 && this.field5850 == arg0.field5850 && this.field5860 == arg0.field5860 && this.field5862 == arg0.field5862 && this.field5867 == arg0.field5867;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 14)
    public static final void method2472(int arg0) {
        field5852++;
        int var1 = -37 / ((64 - arg0) / 51);
        if (class197.field2883 < 0) {
            return;
        }
        long var2 = class165.method1188((byte) 26);
        class197.field2883 = (int) ((long) class197.field2883 - (var2 - class352.field5142));
        if (class197.field2883 > 0) {
            int var4 = (class197.field2883 << 8) / class387.field5513;
            int var5 = 255 - var4;
            float var6 = (float) var4 / 255.0F;
            class430.field6181 = ((class91.field1464 & 0xFF00FF) * var4 + (class514.field7468.field5853 & 0xFF00FF) * var5 & 0xFF00FF00) + ((class91.field1464 & 0xFF00) * var4 + (class514.field7468.field5853 & 0xFF00) * var5 & 0xFF0000) >>> 8;
            float var7 = 1.0F - var6;
            class131.field2055 = (class514.field7468.field5850 - class477.field6946) * var7 + class477.field6946;
            class283.field4216 = (class514.field7468.field5857 - class219.field3348) * var7 + class219.field3348;
            class194.field2813 = (class514.field7468.field5861 - class336.field4968) * var7 + class336.field4968;
            class196.field2866 = class387.field5512 * var4 + class514.field7468.field5862 * var5 >> 8;
            class540.field7953 = ((class66.field1115 & 0xFF00) * var4 + (class514.field7468.field5860 & 0xFF00) * var5 & 0xFF0000) + ((class66.field1115 & 0xFF00FF) * var4 + (class514.field7468.field5860 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8;
            class518.field7506 = (class514.field7468.field5858 - class424.field5994) * var7 + class424.field5994;
            class65.field1111 = (class514.field7468.field5865 - class84.field1334) * var7 + class84.field1334;
            class190.field2783 = (class514.field7468.field5856 - class403.field5737) * var7 + class403.field5737;
            if (class340.field5032 != class514.field7468.field5867) {
                class544.field7987 = class157.field2402.method238(class340.field5032, class514.field7468.field5867, var7, class544.field7987);
            }
        } else {
            class194.field2813 = class514.field7468.field5861;
            class190.field2783 = class514.field7468.field5856;
            class283.field4216 = class514.field7468.field5857;
            class544.field7987 = class514.field7468.field5867;
            class430.field6181 = class514.field7468.field5853;
            class518.field7506 = class514.field7468.field5858;
            class197.field2883 = -1;
            class540.field7953 = class514.field7468.field5860;
            class196.field2866 = class514.field7468.field5862;
            class65.field1111 = class514.field7468.field5865;
            class131.field2055 = class514.field7468.field5850;
        }
        class352.field5142 = var2;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILwn;)V", line = 73)
    public final void method2473(int arg0, class519 arg1) {
        this.field5865 = (float) (arg1.method3072((byte) -120) * 8) / 255.0F;
        field5866++;
        this.field5856 = (float) (arg1.method3072((byte) -120) * 8) / 255.0F;
        if (arg0 >= 66) {
            this.field5850 = (float) (arg1.method3072((byte) -122) * 8) / 255.0F;
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V", line = 131)
    public class414() {
        this.field5851 = -50;
        this.field5861 = 0.69921875F;
        this.field5853 = class466.field6780;
        this.field5867 = class287.field4257;
        this.field5862 = 0;
        this.field5857 = 1.2F;
        this.field5869 = -60;
        this.field5860 = class157.field2401;
        this.field5864 = -50;
        this.field5858 = 1.1523438F;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lwn;)V", line = 150)
    public class414(class519 arg0) {
        int var2 = arg0.method3072((byte) -128);
        if (class220.field3371.method1215(class74.field1211, -4) && class157.field2402.method303() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field5853 = class466.field6780;
            } else {
                this.field5853 = arg0.method3053(-129);
            }
            if ((var2 & 0x2) == 0) {
                this.field5858 = 1.1523438F;
            } else {
                this.field5858 = (float) arg0.method3018(566990904) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field5861 = 0.69921875F;
            } else {
                this.field5861 = (float) arg0.method3018(566990904) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field5857 = 1.2F;
            } else {
                this.field5857 = (float) arg0.method3018(566990904) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method3053(-129);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method3018(566990904);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method3018(566990904);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method3018(566990904);
            }
            this.field5853 = class466.field6780;
            this.field5861 = 0.69921875F;
            this.field5858 = 1.1523438F;
            this.field5857 = 1.2F;
        }
        if ((var2 & 0x10) == 0) {
            this.field5864 = -50;
            this.field5869 = -60;
            this.field5851 = -50;
        } else {
            this.field5851 = arg0.method3044((byte) -86);
            this.field5869 = arg0.method3044((byte) -106);
            this.field5864 = arg0.method3044((byte) -83);
        }
        if ((var2 & 0x20) == 0) {
            this.field5860 = class157.field2401;
        } else {
            this.field5860 = arg0.method3053(-129);
        }
        if ((var2 & 0x40) == 0) {
            this.field5862 = 0;
        } else {
            this.field5862 = arg0.method3018(566990904);
        }
        if ((var2 & 0x80) == 0) {
            this.field5867 = class287.field4257;
        } else {
            int var3 = arg0.method3018(566990904);
            int var4 = arg0.method3018(566990904);
            int var5 = arg0.method3018(566990904);
            int var6 = arg0.method3018(566990904);
            int var7 = arg0.method3018(566990904);
            int var8 = arg0.method3018(566990904);
            this.field5867 = class181.method1255(var8, var6, -1198, var4, var7, var5, var3);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)I", line = 111)
    public static final int method2474(int arg0, int arg1, int arg2) {
        field5854++;
        int var3 = arg2 >> 31 & arg0 - 1;
        return arg1 == -799553825 ? ((arg2 >>> 31) + arg2) % arg0 + var3 : -110;
    }
}
