import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class461 extends class491 {

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "Lkp;")
    public static class507 field5873 = null;

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "[I")
    public static int[] field5880 = new int[4096];

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "I")
    public static int field5876 = 0;

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "[Ltba;")
    public static class704[] field5879 = new class704[300];

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "F")
    public float field5852;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "F")
    public float field5854;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "F")
    public float field5856;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "F")
    public static float field5857;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "F")
    public float field5858;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "F")
    public float field5860;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "F")
    public float field5862;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "F")
    public float field5865;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "F")
    public float field5866;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "F")
    public float field5869;

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "F")
    public float field5871;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "F")
    public float field5872;

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "F")
    public float field5882;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
    public static int field5868;

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III[I)V", line = 3)
    public final void method906(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field5866 + (float) arg0 * this.field5852 + (float) arg1 * this.field5854 + this.field5858);
        field5855++;
        arg3[0] = (int) ((float) arg2 * this.field5862 + (float) arg0 * this.field5869 + (float) arg1 * this.field5856 + this.field5865);
        arg3[2] = (int) ((float) arg2 * this.field5872 + (float) arg0 * this.field5860 + (float) arg1 * this.field5882 + this.field5871);
    }

    @OriginalMember(owner = "client!rd", name = "U", descriptor = "(III)V", line = 14)
    public final void method903(int arg0, int arg1, int arg2) {
        this.field5858 += arg1;
        this.field5865 += arg0;
        field5861++;
        this.field5871 += arg2;
    }

    @OriginalMember(owner = "client!rd", name = "ZA", descriptor = "(I)V", line = 27)
    public final void method910(int arg0) {
        field5867++;
        float var2 = class228.field2837[arg0 & 0x3FFF];
        float var3 = class228.field2839[arg0 & 0x3FFF];
        float var4 = this.field5869;
        float var5 = this.field5856;
        float var6 = this.field5862;
        this.field5869 = this.field5860 * var3 + var2 * var4;
        float var7 = this.field5865;
        this.field5860 = this.field5860 * var2 - var3 * var4;
        this.field5856 = this.field5882 * var3 + var2 * var5;
        this.field5862 = this.field5872 * var3 + var2 * var6;
        this.field5882 = this.field5882 * var2 - var3 * var5;
        this.field5865 = this.field5871 * var3 + var2 * var7;
        this.field5872 = this.field5872 * var2 - (var3 * var6);
        this.field5871 = this.field5871 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "()Lq;", line = 54)
    public final class491 method907() {
        field5883++;
        class461 var1 = new class461();
        var1.field5869 = this.field5869;
        var1.field5866 = this.field5866;
        var1.field5856 = this.field5856;
        var1.field5871 = this.field5871;
        var1.field5854 = this.field5854;
        var1.field5858 = this.field5858;
        var1.field5865 = this.field5865;
        var1.field5860 = this.field5860;
        var1.field5882 = this.field5882;
        var1.field5862 = this.field5862;
        var1.field5852 = this.field5852;
        var1.field5872 = this.field5872;
        return var1;
    }

    @OriginalMember(owner = "client!rd", name = "AA", descriptor = "(I)V", line = 81)
    public final void method924(int arg0) {
        field5859++;
        float var2 = class228.field2837[arg0 & 0x3FFF];
        float var3 = class228.field2839[arg0 & 0x3FFF];
        float var4 = this.field5869;
        float var5 = this.field5856;
        float var6 = this.field5862;
        float var7 = this.field5865;
        this.field5869 = var2 * var4 - (this.field5852 * var3);
        this.field5852 = this.field5852 * var2 + var3 * var4;
        this.field5856 = var2 * var5 - this.field5854 * var3;
        this.field5862 = var2 * var6 - this.field5866 * var3;
        this.field5854 = this.field5854 * var2 + var3 * var5;
        this.field5865 = var2 * var7 - this.field5858 * var3;
        this.field5866 = this.field5866 * var2 + var3 * var6;
        this.field5858 = this.field5858 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "(I)V", line = 114)
    public final void method922(int arg0) {
        field5863++;
        float var2 = class228.field2837[arg0 & 0x3FFF];
        float var3 = class228.field2839[arg0 & 0x3FFF];
        float var4 = this.field5852;
        float var5 = this.field5854;
        float var6 = this.field5866;
        float var7 = this.field5858;
        this.field5852 = var2 * var4 - this.field5860 * var3;
        this.field5860 = this.field5860 * var2 + var3 * var4;
        this.field5854 = var2 * var5 - (this.field5882 * var3);
        this.field5866 = var2 * var6 - (this.field5872 * var3);
        this.field5882 = this.field5882 * var2 + var3 * var5;
        this.field5872 = this.field5872 * var2 + var3 * var6;
        this.field5858 = var2 * var7 - (this.field5871 * var3);
        this.field5871 = this.field5871 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!rd", name = "oa", descriptor = "(I)V", line = 146)
    public final void method911(int arg0) {
        this.field5869 = 1.0F;
        field5881++;
        this.field5854 = this.field5872 = class228.field2837[arg0 & 0x3FFF];
        this.field5882 = class228.field2839[arg0 & 0x3FFF];
        this.field5856 = this.field5862 = this.field5865 = this.field5852 = this.field5858 = this.field5860 = this.field5871 = 0.0F;
        this.field5866 = -this.field5882;
    }

    @OriginalMember(owner = "client!rd", name = "YA", descriptor = "([I)V", line = 161)
    public final void method901(int[] arg0) {
        field5864++;
        float var2 = (float) arg0[0] - this.field5865;
        float var3 = (float) arg0[1] - this.field5858;
        float var4 = (float) arg0[2] - this.field5871;
        arg0[0] = (int) (this.field5860 * var4 + this.field5869 * var2 + this.field5852 * var3);
        arg0[2] = (int) (this.field5872 * var4 + this.field5866 * var3 + this.field5862 * var2);
        arg0[1] = (int) (this.field5882 * var4 + this.field5856 * var2 + this.field5854 * var3);
    }

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "(I)V", line = 179)
    public final void method902(int arg0) {
        this.field5872 = 1.0F;
        field5878++;
        this.field5869 = this.field5854 = class228.field2837[arg0 & 0x3FFF];
        this.field5852 = class228.field2839[arg0 & 0x3FFF];
        this.field5856 = -this.field5852;
        this.field5862 = this.field5865 = this.field5866 = this.field5858 = this.field5860 = this.field5882 = this.field5871 = 0.0F;
    }

    @OriginalMember(owner = "client!rd", name = "NA", descriptor = "(III)V", line = 193)
    public final void method914(int arg0, int arg1, int arg2) {
        this.field5858 = arg1;
        this.field5871 = arg2;
        this.field5852 = this.field5860 = this.field5856 = this.field5882 = this.field5862 = this.field5866 = 0.0F;
        this.field5869 = this.field5854 = this.field5872 = 1.0F;
        this.field5865 = arg0;
        field5870++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V", line = 208)
    public static void method2456(byte arg0) {
        field5879 = null;
        field5880 = null;
        if (arg0 < 14) {
            field5876 = -126;
        }
        field5873 = null;
    }

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "(Lq;)V", line = 220)
    public final void method919(class491 arg0) {
        field5874++;
        class461 var2 = (class461) arg0;
        this.field5871 = var2.field5871;
        this.field5865 = var2.field5865;
        this.field5872 = var2.field5872;
        this.field5869 = var2.field5869;
        this.field5858 = var2.field5858;
        this.field5882 = var2.field5882;
        this.field5860 = var2.field5860;
        this.field5866 = var2.field5866;
        this.field5854 = var2.field5854;
        this.field5856 = var2.field5856;
        this.field5852 = var2.field5852;
        this.field5862 = var2.field5862;
    }

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "(I)V", line = 251)
    public final void method908(int arg0) {
        field5875++;
        this.field5854 = 1.0F;
        this.field5869 = this.field5872 = class228.field2837[arg0 & 0x3FFF];
        this.field5862 = class228.field2839[arg0 & 0x3FFF];
        this.field5856 = this.field5865 = this.field5852 = this.field5866 = this.field5858 = this.field5882 = this.field5871 = 0.0F;
        this.field5860 = -this.field5862;
    }

    @OriginalMember(owner = "client!rd", name = "na", descriptor = "(IIIIII)V", line = 270)
    public final void method920(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5868++;
        float var7 = class228.field2837[arg3 & 0x3FFF];
        float var8 = class228.field2839[arg3 & 0x3FFF];
        float var9 = class228.field2837[arg4 & 0x3FFF];
        float var10 = class228.field2839[arg4 & 0x3FFF];
        float var11 = class228.field2837[arg5 & 0x3FFF];
        float var12 = class228.field2839[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field5852 = -var9 * var12 + var10 * var13;
        this.field5854 = var7 * var11;
        this.field5872 = var7 * var9;
        this.field5882 = -var8;
        this.field5866 = var9 * var13 + var10 * var12;
        this.field5869 = var9 * var11 + var10 * var14;
        this.field5860 = var7 * var10;
        this.field5862 = -var10 * var11 + var9 * var14;
        this.field5856 = var7 * var12;
        this.field5865 = (float) (-arg0) * this.field5869 - ((float) arg1 * this.field5856) - ((float) arg2 * this.field5862);
        this.field5858 = (float) (-arg0) * this.field5852 - ((float) arg1 * this.field5854) - ((float) arg2 * this.field5866);
        this.field5871 = (float) (-arg0) * this.field5860 - ((float) arg1 * this.field5882) - ((float) arg2 * this.field5872);
    }

    @OriginalMember(owner = "client!rd", name = "wa", descriptor = "(III[I)V", line = 307)
    public final void method905(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field5866 + (float) arg0 * this.field5852 + (float) arg1 * this.field5854);
        field5877++;
        arg3[2] = (int) ((float) arg2 * this.field5872 + (float) arg0 * this.field5860 + (float) arg1 * this.field5882);
        arg3[0] = (int) ((float) arg2 * this.field5862 + (float) arg0 * this.field5869 + (float) arg1 * this.field5856);
    }

    @OriginalMember(owner = "client!rd", name = "Y", descriptor = "()V", line = 319)
    public final void method918() {
        field5853++;
        this.field5852 = this.field5860 = this.field5856 = this.field5882 = this.field5862 = this.field5866 = this.field5865 = this.field5858 = this.field5871 = 0.0F;
        this.field5869 = this.field5854 = this.field5872 = 1.0F;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V", line = 349)
    public class461() {
        this.method918();
    }
}
