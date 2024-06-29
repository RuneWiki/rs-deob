import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class18 implements class268 {

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "Lcca;")
    private class462 field230 = new class462(256);

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "Lwu;")
    private class557 field222;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "Lwu;")
    private class557 field223;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    private int field228;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "[Ljp;")
    private class468[] field225;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field218 = 0;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "J")
    public static long field221 = 0L;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)Z")
    public final boolean method86(byte arg0, int arg1) {
        field220++;
        if (arg0 == 117) {
            class634 var3 = this.method90(arg1, 0);
            return var3 != null && var3.method3682(this.field222, -102, this);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZIFIZI)[I")
    public final int[] method87(boolean arg0, int arg1, float arg2, int arg3, boolean arg4, int arg5) {
        field224++;
        if (!arg4) {
            field221 = 24L;
        }
        return this.method90(arg5, 0).method3681(arg0, (double) arg2, this, this.field225[arg5].field6400, -1, arg1, arg3, this.field222);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)I")
    public final int method88(int arg0) {
        field219++;
        int var2 = 49 % ((arg0 + 57) / 58);
        return this.field228;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(FZZIII)[I")
    public final int[] method89(float arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg1) {
            field227++;
            return this.method90(arg4, 0).method3686(this, this.field222, this.field225[arg4].field6400, arg3, (byte) 97, arg5, (double) arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)Lfca;")
    private final class634 method90(int arg0, int arg1) {
        field229++;
        class287 var3 = this.field230.method2761((byte) 79, (long) arg0);
        if (var3 != null) {
            return (class634) var3;
        }
        byte[] var4 = this.field223.method3318(arg1 + 8941, arg0);
        if (var4 == null) {
            return null;
        }
        if (arg1 != 0) {
            this.method86((byte) 58, -84);
        }
        class634 var5 = new class634(new class26(var4));
        this.field230.method2764((long) arg0, var5, -4900);
        return var5;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)Ljp;")
    public final class468 method91(int arg0, int arg1) {
        field233++;
        if (arg1 != -22805) {
            method93(73);
        }
        return this.field225[arg0];
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZIFIB)[F")
    public final float[] method92(int arg0, boolean arg1, int arg2, float arg3, int arg4, byte arg5) {
        if (arg5 != 122) {
            this.method91(98, -81);
        }
        field226++;
        return this.method90(arg2, 0).method3684(this, this.field225[arg2].field6400, this.field222, arg4, arg0, (byte) 105);
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
    public static final void method93(int arg0) {
        field232++;
        class196.field2837.method319(31304);
        class93.field1263.method807(-88);
        class306.field3966.method2690((byte) 71);
        class438.field6016.setBackground(Color.black);
        class538.field7530 = -1;
        class196.field2837 = class507.method3025((byte) 90, class438.field6016);
        class93.field1263 = class573.method3416(class438.field6016, true, 512);
        if (arg0 != -21347) {
            field221 = 82L;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lwu;Lwu;Lwu;)V")
    public class18(class557 arg0, class557 arg1, class557 arg2) {
        this.field222 = arg2;
        this.field223 = arg1;
        class26 var4 = new class26(arg0.method3322(0, 0, (byte) 98));
        this.field228 = var4.method193(2);
        this.field225 = new class468[this.field228];
        for (int var5 = 0; var5 < this.field228; var5++) {
            if (var4.method194((byte) 119) == 1) {
                this.field225[var5] = new class468();
            }
        }
        for (int var6 = 0; var6 < this.field228; var6++) {
            if (this.field225[var6] != null) {
                this.field225[var6].field6389 = var4.method194((byte) 119) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field228; var7++) {
            if (this.field225[var7] != null) {
                this.field225[var7].field6391 = var4.method194((byte) 119) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field228; var8++) {
            if (this.field225[var8] != null) {
                this.field225[var8].field6383 = var4.method194((byte) 119) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field228; var9++) {
            if (this.field225[var9] != null) {
                this.field225[var9].field6399 = var4.method195(128);
            }
        }
        for (int var10 = 0; var10 < this.field228; var10++) {
            if (this.field225[var10] != null) {
                this.field225[var10].field6381 = var4.method195(128);
            }
        }
        for (int var11 = 0; var11 < this.field228; var11++) {
            if (this.field225[var11] != null) {
                this.field225[var11].field6386 = var4.method195(128);
            }
        }
        for (int var12 = 0; var12 < this.field228; var12++) {
            if (this.field225[var12] != null) {
                this.field225[var12].field6398 = var4.method195(128);
            }
        }
        for (int var13 = 0; var13 < this.field228; var13++) {
            if (this.field225[var13] != null) {
                this.field225[var13].field6394 = (short) var4.method193(2);
            }
        }
        for (int var14 = 0; var14 < this.field228; var14++) {
            if (this.field225[var14] != null) {
                this.field225[var14].field6388 = var4.method195(128);
            }
        }
        for (int var15 = 0; var15 < this.field228; var15++) {
            if (this.field225[var15] != null) {
                this.field225[var15].field6390 = var4.method195(128);
            }
        }
        for (int var16 = 0; var16 < this.field228; var16++) {
            if (this.field225[var16] != null) {
                this.field225[var16].field6385 = var4.method194((byte) 119) == 1;
            }
        }
        for (int var17 = 0; var17 < this.field228; var17++) {
            if (this.field225[var17] != null) {
                this.field225[var17].field6400 = var4.method194((byte) 119) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field228; var18++) {
            if (this.field225[var18] != null) {
                this.field225[var18].field6397 = var4.method195(128);
            }
        }
        for (int var19 = 0; var19 < this.field228; var19++) {
            if (this.field225[var19] != null) {
                this.field225[var19].field6387 = var4.method194((byte) 119) == 1;
            }
        }
        for (int var20 = 0; var20 < this.field228; var20++) {
            if (this.field225[var20] != null) {
                this.field225[var20].field6380 = var4.method194((byte) 119) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field228; var21++) {
            if (this.field225[var21] != null) {
                this.field225[var21].field6379 = var4.method194((byte) 119) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field228; var22++) {
            if (this.field225[var22] != null) {
                this.field225[var22].field6384 = var4.method194((byte) 119);
            }
        }
        for (int var23 = 0; var23 < this.field228; var23++) {
            if (this.field225[var23] != null) {
                this.field225[var23].field6392 = var4.method189(255);
            }
        }
        for (int var24 = 0; var24 < this.field228; var24++) {
            if (this.field225[var24] != null) {
                this.field225[var24].field6393 = var4.method194((byte) 119);
            }
        }
    }
}
