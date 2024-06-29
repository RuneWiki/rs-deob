import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class509 extends class425 {

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public int field7200 = 0;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "Lcb;")
    public static class483 field7205 = new class483();

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "[I")
    public static int[] field7210 = new int[16384];

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "[I")
    public static int[] field7220 = new int[16384];

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field7225 = new String[5];

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public int field7197;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public int field7201;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public int field7202;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public int field7204;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    public int field7211;

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
    public int field7217;

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "I")
    public int field7219;

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
    public int field7222;

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "I")
    public int field7223;

    @OriginalMember(owner = "client!ea", name = "P", descriptor = "I")
    public int field7227;

    @OriginalMember(owner = "client!ea", name = "Q", descriptor = "I")
    public int field7228;

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "J")
    public static long field7226;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "Lan;")
    public class22 field7195;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "Lcl;")
    public class245 field7212;

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "Lcl;")
    public class245 field7221;

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "Lsaa;")
    public static class300 field7215;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Lnq;")
    public class429 field7198;

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "Lnq;")
    public class429 field7224;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "Lbd;")
    public class56 field7203;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "Log;")
    public class602 field7209;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "Lee;")
    public class630 field7196;

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "Lee;")
    public class630 field7216;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "Z")
    public boolean field7199;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "Z")
    public boolean field7206;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "Z")
    public boolean field7207;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "[I")
    public int[] field7214;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "[[[Ldf;")
    public static class370[][][] field7213;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIZZI)V")
    public static final void method3014(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        if (arg2 > arg6) {
            int var7 = (arg2 + arg6) / 2;
            int var8 = arg6;
            class135 var9 = class366.field5422[var7];
            class366.field5422[var7] = class366.field5422[arg2];
            class366.field5422[arg2] = var9;
            for (int var10 = arg6; var10 < arg2; var10++) {
                if (class20.method441(true, class366.field5422[var10], var9, arg5, arg3, arg1, arg4) <= 0) {
                    class135 var11 = class366.field5422[var10];
                    class366.field5422[var10] = class366.field5422[var8];
                    class366.field5422[var8++] = var11;
                }
            }
            class366.field5422[arg2] = class366.field5422[var8];
            class366.field5422[var8] = var9;
            method3014(-15, arg1, var8 - 1, arg3, arg4, arg5, arg6);
            method3014(-76, arg1, arg2, arg3, arg4, arg5, var8 + 1);
        }
        if (arg0 > -3) {
            method3016(10);
        }
        field7218++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public final void method3015(int arg0) {
        field7208++;
        int var2 = this.field7223;
        boolean var3 = this.field7207;
        if (this.field7203 != null) {
            class56 var6 = this.field7203.method662(3433, class113.field2038);
            if (var6 == null) {
                this.field7211 = 0;
                this.field7207 = false;
                this.field7223 = -1;
                this.field7219 = 0;
                this.field7206 = false;
                this.field7204 = 0;
                this.field7214 = null;
                this.field7227 = 0;
            } else {
                this.field7206 = var6.field1310;
                this.field7227 = var6.field1299;
                this.field7204 = var6.field1302;
                this.field7207 = var6.field1274;
                this.field7223 = var6.field1241;
                this.field7219 = var6.field1222;
                this.field7214 = var6.field1243;
                this.field7211 = var6.field1304 << 9;
            }
        } else if (this.field7195 != null) {
            int var4 = class379.method2371(-161, this.field7195);
            if (var2 != var4) {
                this.field7223 = var4;
                class334 var5 = this.field7195.field880;
                if (var5.field4984 != null) {
                    var5 = var5.method2150(class113.field2038, -32224);
                }
                if (var5 == null) {
                    this.field7227 = this.field7211 = 0;
                    this.field7207 = this.field7195.field880.field5002;
                } else {
                    this.field7207 = var5.field5002;
                    this.field7227 = var5.field4998;
                    this.field7211 = var5.field5005 << 9;
                }
            }
        } else if (this.field7209 != null) {
            this.field7223 = class535.method3095(this.field7209, (byte) 101);
            this.field7207 = this.field7209.field8642;
            this.field7227 = this.field7209.field8666;
            this.field7211 = this.field7209.field8625 << 9;
        }
        if (arg0 <= 62) {
            this.field7207 = false;
        }
        if (this.field7223 == var2 && var3 == this.field7207) {
            return;
        }
        if (this.field7212 == null) {
            return;
        }
        class50.field1184.method2073(this.field7212);
        this.field7198 = null;
        this.field7212 = null;
        this.field7216 = null;
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V")
    public static void method3016(int arg0) {
        if (arg0 != -9258) {
            field7220 = null;
        }
        field7215 = null;
        field7225 = null;
        field7210 = null;
        field7205 = null;
        field7213 = null;
        field7220 = null;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field7210[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field7220[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
    }
}
