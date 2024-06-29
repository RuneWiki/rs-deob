import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class62 implements class235 {

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Lei;")
    private class289 field821 = new class289(256);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Lct;")
    private class104 field813;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "Lct;")
    private class104 field815;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "[Lqr;")
    private class17[] field825;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "[S")
    public static short[] field820;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field824;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "Z")
    public static boolean field826;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZIIIFI)[F")
    public final float[] method460(boolean arg0, int arg1, int arg2, int arg3, float arg4, int arg5) {
        field823++;
        return arg3 >= -96 ? null : this.method466(arg2, (byte) 122).method622(arg5, this.field825[arg2].field278, arg1, this.field815, this, (byte) -55);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZIIFB)[I")
    public final int[] method461(int arg0, boolean arg1, int arg2, int arg3, float arg4, byte arg5) {
        field816++;
        return arg5 == -96 ? this.method466(arg0, (byte) 122).method620(this, arg2, this.field815, this.field825[arg0].field278, arg3, (double) arg4, 0) : null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static final void method462(int arg0) {
        class440.field6411 = arg0;
        for (int var1 = 0; var1 < class329.field4899; var1++) {
            for (int var2 = 0; var2 < class380.field5590; var2++) {
                if (class178.field2530[arg0][var1][var2] == null) {
                    class178.field2530[arg0][var1][var2] = new class369(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Z")
    public final boolean method463(int arg0, int arg1) {
        field818++;
        if (arg1 != -26564) {
            this.method463(55, -2);
        }
        class91 var3 = this.method466(arg0, (byte) 122);
        return var3 != null && var3.method615(this, this.field815, 0);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZIIIF)[I")
    public final int[] method464(int arg0, boolean arg1, int arg2, int arg3, int arg4, float arg5) {
        field819++;
        return arg4 == 4260 ? this.method466(arg3, (byte) 122).method621(this.field825[arg3].field278, arg2, arg0, (double) arg5, this.field815, arg1, (byte) 21, this) : null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)V")
    public static final void method465(int arg0, int arg1, int arg2, int arg3) {
        if (class299.field4360 != null) {
            class299.field4360[arg0][arg1] = (arg3 & 0x7F8) << 21 | arg2 & 0xFFFFFF;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)Lhp;")
    private final class91 method466(int arg0, byte arg1) {
        field814++;
        class29 var3 = this.field821.method1933((long) arg0, 0);
        if (var3 != null) {
            return (class91) var3;
        } else if (arg1 == 122) {
            byte[] var4 = this.field813.method733(arg1 ^ 0x7A, arg0);
            if (var4 == null) {
                return null;
            } else {
                class91 var5 = new class91(new class256(var4));
                this.field821.method1937(-119, (long) arg0, var5);
                return var5;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
    public static void method467(boolean arg0) {
        field824 = null;
        field820 = null;
        if (!arg0) {
            field826 = false;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)Lqr;")
    public final class17 method468(byte arg0, int arg1) {
        if (arg0 != -37) {
            this.field815 = null;
        }
        field817++;
        return this.field825[arg1];
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lct;Lct;Lct;)V")
    public class62(class104 arg0, class104 arg1, class104 arg2) {
        this.field813 = arg1;
        this.field815 = arg2;
        class256 var4 = new class256(arg0.method715(0, (byte) 54, 0));
        int var5 = var4.method1767(1930493576);
        this.field825 = new class17[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1738((byte) 86) == 1) {
                this.field825[var6] = new class17();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field825[var7] != null) {
                this.field825[var7].field260 = var4.method1738((byte) 88) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field825[var8] != null) {
                this.field825[var8].field262 = var4.method1738((byte) 49) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field825[var9] != null) {
                this.field825[var9].field271 = var4.method1738((byte) 83) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field825[var10] != null) {
                this.field825[var10].field272 = var4.method1738((byte) 122) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field825[var11] != null) {
                this.field825[var11].field270 = var4.method1728((byte) 119);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field825[var12] != null) {
                this.field825[var12].field276 = var4.method1728((byte) 110);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field825[var13] != null) {
                this.field825[var13].field279 = var4.method1728((byte) 99);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field825[var14] != null) {
                this.field825[var14].field275 = var4.method1728((byte) 127);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field825[var15] != null) {
                this.field825[var15].field259 = (short) var4.method1767(1930493576);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field825[var16] != null) {
                this.field825[var16].field274 = var4.method1728((byte) 99);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field825[var17] != null) {
                this.field825[var17].field266 = var4.method1728((byte) 109);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field825[var18] != null) {
                this.field825[var18].field267 = var4.method1738((byte) -21) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field825[var19] != null) {
                this.field825[var19].field278 = var4.method1738((byte) 123) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field825[var20] != null) {
                this.field825[var20].field277 = var4.method1728((byte) 120);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field825[var21] != null) {
                this.field825[var21].field268 = var4.method1738((byte) 121) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field825[var22] != null) {
                this.field825[var22].field263 = var4.method1738((byte) 73) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field825[var23] != null) {
                this.field825[var23].field273 = var4.method1738((byte) 58) == 1;
            }
        }
    }

    static {
        new class409((String) null, "geschickt werden.", (String) null, (String) null);
        field820 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
        field822 = -1;
        field824 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field826 = true;
    }
}
