import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class409 {

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    private int field6207 = 0;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "I")
    private int field6209 = -1;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "Lps;")
    private class63 field6211 = new class63();

    @OriginalMember(owner = "client!im", name = "m", descriptor = "Z")
    public boolean field6213 = false;

    @OriginalMember(owner = "client!im", name = "j", descriptor = "I")
    private int field6210;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    private int field6206;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "[Lor;")
    private class460[] field6203;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "[[I")
    private int[][] field6202;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "Lik;")
    public static class141 field6214;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!im", name = "o", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V")
    public static void method2521(byte arg0) {
        field6214 = null;
        if (arg0 != -109) {
            field6215 = -40;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)[I")
    public final int[] method2522(int arg0, int arg1) {
        if (arg1 != 16863) {
            method2525(-16, null, null, -127);
        }
        field6204++;
        if (this.field6210 == this.field6206) {
            this.field6213 = this.field6203[arg0] == null;
            this.field6203[arg0] = class110.field1546;
            return this.field6202[arg0];
        } else if (this.field6206 == 1) {
            this.field6213 = this.field6209 != arg0;
            this.field6209 = arg0;
            return this.field6202[0];
        } else {
            class460 var3 = this.field6203[arg0];
            if (var3 == null) {
                this.field6213 = true;
                if (this.field6206 > this.field6207) {
                    var3 = new class460(arg0, this.field6207);
                    this.field6207++;
                } else {
                    class460 var4 = (class460) this.field6211.method457(-2);
                    var3 = new class460(arg0, var4.field6888);
                    this.field6203[var4.field6885] = null;
                    var4.method25(-13489);
                }
                this.field6203[arg0] = var3;
            } else {
                this.field6213 = false;
            }
            this.field6211.method448(-20, var3);
            return this.field6202[var3.field6888];
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)[[I")
    public final int[][] method2523(int arg0) {
        field6205++;
        if (this.field6210 != this.field6206) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != -1) {
            this.field6213 = false;
        }
        for (int var2 = 0; var2 < this.field6206; var2++) {
            this.field6203[var2] = class110.field1546;
        }
        return this.field6202;
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(I)V")
    public final void method2524(int arg0) {
        for (int var2 = arg0; var2 < this.field6206; var2++) {
            this.field6202[var2] = null;
        }
        field6208++;
        this.field6203 = null;
        this.field6202 = null;
        this.field6211.method450((byte) 73);
        this.field6211 = null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I")
    public static final int method2525(int arg0, String arg1, String arg2, int arg3) {
        field6212++;
        int var4 = arg1.length();
        int var5 = arg2.length();
        int var6 = 0;
        int var7 = arg0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > (var6 - var8) || var5 > (var7 - var9)) {
            if (var6 - var8 >= var4) {
                return -1;
            }
            if (var5 <= var7 - var9) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg1.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg2.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class448.method2740(var22, 69);
            var9 = class448.method2740(var24, 69);
            char var26 = class437.method2656(var22, arg3, true);
            char var27 = class437.method2656(var24, arg3, true);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class54.method395(var28, arg3, 11560) - class54.method395(var29, arg3, arg0 ^ 0x2D28);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg3 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg1.charAt(var17);
            char var19 = arg2.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class54.method395(var20, arg3, 11560) - class54.method395(var21, arg3, 11560);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg1.charAt(var13);
            char var15 = arg2.charAt(var13);
            if (var14 != var15) {
                return class54.method395(var14, arg3, 11560) - class54.method395(var15, arg3, 11560);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IZZ)V")
    public static final void method2526(int arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            class118.field1618++;
            class452.method2758(10584);
        }
        field6201++;
        if (arg0 != 0) {
            method2525(28, null, null, -62);
        }
        if (arg2) {
            class56.field822++;
            class507.method3037(-95);
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(III)V")
    public class409(int arg0, int arg1, int arg2) {
        this.field6210 = arg1;
        this.field6206 = arg0;
        this.field6203 = new class460[this.field6210];
        this.field6202 = new int[this.field6206][arg2];
    }

    static {
        new class446("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
        field6214 = new class141(5000);
    }
}
