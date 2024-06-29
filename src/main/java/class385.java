import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class385 {

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "I")
    private int field5318 = -1;

    @OriginalMember(owner = "client!vs", name = "r", descriptor = "I")
    private int field5331 = 0;

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "Lld;")
    private class105 field5319 = new class105();

    @OriginalMember(owner = "client!vs", name = "w", descriptor = "Z")
    public boolean field5336 = false;

    @OriginalMember(owner = "client!vs", name = "s", descriptor = "I")
    private int field5332;

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
    private int field5315;

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "[[[I")
    private int[][][] field5317;

    @OriginalMember(owner = "client!vs", name = "o", descriptor = "[Lwh;")
    private class90[] field5328;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "[[Z")
    public static boolean[][] field5316 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!vs", name = "m", descriptor = "[I")
    public static int[] field5326 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!vs", name = "n", descriptor = "[Z")
    public static boolean[] field5327 = new boolean[100];

    @OriginalMember(owner = "client!vs", name = "p", descriptor = "J")
    public static long field5329 = -1L;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "Lnk;")
    public static class464 field5314 = null;

    @OriginalMember(owner = "client!vs", name = "u", descriptor = "Z")
    public static boolean field5334 = false;

    @OriginalMember(owner = "client!vs", name = "x", descriptor = "Lh;")
    public static class434 field5337;

    @OriginalMember(owner = "client!vs", name = "y", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!vs", name = "l", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!vs", name = "q", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!vs", name = "t", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!vs", name = "z", descriptor = "J")
    public static long field5339;

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "[I")
    public static int[] field5323;

    @OriginalMember(owner = "client!vs", name = "v", descriptor = "[I")
    public static int[] field5335;

    static {
        new class206("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        field5337 = new class434(75, 0);
        field5338 = 0;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)[[I", line = 3)
    public final int[][] method2356(int arg0, int arg1) {
        field5325++;
        if (arg1 <= 73) {
            return null;
        } else if (this.field5332 == this.field5315) {
            this.field5336 = this.field5328[arg0] == null;
            this.field5328[arg0] = class216.field2910;
            return this.field5317[arg0];
        } else if (this.field5332 == 1) {
            this.field5336 = this.field5318 != arg0;
            this.field5318 = arg0;
            return this.field5317[0];
        } else {
            class90 var3 = this.field5328[arg0];
            if (var3 == null) {
                this.field5336 = true;
                if (this.field5331 >= this.field5332) {
                    class90 var4 = (class90) this.field5319.method649(18947);
                    var3 = new class90(arg0, var4.field1316);
                    this.field5328[var4.field1313] = null;
                    var4.method2614((byte) -112);
                } else {
                    var3 = new class90(arg0, this.field5331);
                    this.field5331++;
                }
                this.field5328[arg0] = var3;
            } else {
                this.field5336 = false;
            }
            this.field5319.method646(121, var3);
            return this.field5317[var3.field1316];
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V", line = 73)
    public static void method2357(int arg0) {
        field5326 = null;
        if (arg0 != 3) {
            method2361((byte) 107, -108, 107);
        }
        field5316 = null;
        field5337 = null;
        field5323 = null;
        field5335 = null;
        field5314 = null;
        field5327 = null;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IB)Z", line = 101)
    public static final boolean method2358(int arg0, byte arg1) {
        field5324++;
        class348 var2 = class445.method2613(arg0, (byte) -62);
        if (var2 == null) {
            return false;
        } else if (class241.field3211 == 3) {
            String var3 = "";
            if (class377.field5197 != class278.field3682) {
                var3 = ":" + (var2.field4786 + 7000);
            }
            String var4 = "";
            if (class441.field5949 != null) {
                var4 = "/p=" + class441.field5949;
            }
            if (arg1 != -31) {
                method2360(-87);
            }
            String var5 = "http://" + var2.field4791 + var3 + "/l=" + class110.field1676 + "/a=" + class448.field6099 + var4 + "/j" + (class284.field3842 ? "1" : "0") + ",o" + (class356.field4911 ? "1" : "0") + ",a2";
            try {
                class6.field81.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        } else {
            class33.field506 = var2.field4786;
            class168.field2325 = var2.field4791;
            if (class377.field5197 != class278.field3682) {
                class95.field1403 = class33.field506 + 40000;
                class289.field3890 = class33.field506 + 50000;
                class265.field3503 = class95.field1403;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(III)V", line = 280)
    public class385(int arg0, int arg1, int arg2) {
        this.field5332 = arg0;
        this.field5315 = arg1;
        this.field5317 = new int[this.field5332][3][arg2];
        this.field5328 = new class90[this.field5315];
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Z)[[[I", line = 161)
    public final int[][][] method2359(boolean arg0) {
        field5333++;
        if (this.field5332 != this.field5315) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0) {
            method2358(87, (byte) -101);
        }
        for (int var2 = 0; var2 < this.field5332; var2++) {
            this.field5328[var2] = class216.field2910;
        }
        return this.field5317;
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V", line = 184)
    public static final void method2360(int arg0) {
        class431.field5879 = true;
        field5322++;
        if (arg0 > -6) {
            method2358(80, (byte) -104);
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(BII)V", line = 199)
    public static final void method2361(byte arg0, int arg1, int arg2) {
        field5330++;
        class106 var3 = class250.method1400(13, -83, arg2);
        if (arg0 < 100) {
            field5323 = null;
        }
        var3.method658(0);
        var3.field1589 = arg1;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V", line = 219)
    public final void method2362(byte arg0) {
        for (int var2 = 0; var2 < this.field5332; var2++) {
            this.field5317[var2][0] = null;
            this.field5317[var2][1] = null;
            this.field5317[var2][2] = null;
            this.field5317[var2] = null;
        }
        field5321++;
        this.field5328 = null;
        this.field5317 = null;
        this.field5319.method645(0);
        if (arg0 < 52) {
            this.method2356(-22, 73);
        }
        this.field5319 = null;
    }
}
