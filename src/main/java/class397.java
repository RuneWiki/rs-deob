import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class397 {

    @OriginalMember(owner = "client!st", name = "c", descriptor = "Z")
    private boolean field5513 = false;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "Z")
    private boolean field5511 = false;

    @OriginalMember(owner = "client!st", name = "e", descriptor = "I")
    public int field5515 = 443;

    @OriginalMember(owner = "client!st", name = "k", descriptor = "I")
    public int field5521 = 43594;

    @OriginalMember(owner = "client!st", name = "h", descriptor = "[[Z")
    public static boolean[][] field5518 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!st", name = "b", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!st", name = "g", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!st", name = "i", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!st", name = "j", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!st", name = "l", descriptor = "I")
    public int field5522;

    @OriginalMember(owner = "client!st", name = "f", descriptor = "Ljava/lang/String;")
    public String field5516;

    @OriginalMember(owner = "client!st", name = "m", descriptor = "[[[I")
    public static int[][][] field5523;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ILtt;)Loaa;")
    public final class260 method2256(int arg0, class79 arg1) {
        if (arg0 != 43594) {
            method2257(23, null);
        }
        field5520++;
        return arg1.method616(this.field5516, (byte) -123, this.field5511 ? this.field5515 : this.field5521, this.field5513);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ILjava/awt/Canvas;)Lkg;")
    public static final class246 method2257(int arg0, Canvas arg1) {
        field5514++;
        try {
            if (arg0 < 30) {
                return null;
            } else {
                Class var2 = Class.forName("lj");
                class246 var3 = (class246) var2.getDeclaredConstructor().newInstance();
                var3.method1523(arg1, false);
                return var3;
            }
        } catch (Throwable var5) {
            class448 var4 = new class448();
            var4.method1523(arg1, false);
            return var4;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Lst;B)Z")
    public final boolean method2258(class397 arg0, byte arg1) {
        field5512++;
        if (arg1 != 83) {
            field5523 = null;
        }
        if (arg0 == null) {
            return false;
        } else {
            return this.field5522 == arg0.field5522 && this.field5516.equals(arg0.field5516);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Z)V")
    public static void method2259(boolean arg0) {
        if (!arg0) {
            field5518 = null;
        }
        field5518 = null;
        field5523 = null;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(B)V")
    public final void method2260(byte arg0) {
        field5519++;
        int var2 = 61 / ((arg0 + 45) / 48);
        if (!this.field5511) {
            this.field5513 = true;
            this.field5511 = true;
        } else if (this.field5513) {
            this.field5513 = false;
        } else {
            this.field5511 = false;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Lmh;IIIII)V")
    public static final void method2261(class577 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field7757 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class185.field2716[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class517 var13 = class324.field4793[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field7757; var14++) {
                            if (arg0.field7752[var14] == var13.field7053) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field7752[arg0.field7757++] = var13.field7053;
                        if (arg0.field7757 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field7757; var15 < 4; var15++) {
            arg0.field7752[var15] = null;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Lfaa;B)Ljava/lang/String;")
    public static final String method2262(class140 arg0, byte arg1) {
        field5517++;
        if (client.method1655(arg0).method2848(-1) == 0) {
            return null;
        } else if (arg1 != 23) {
            return null;
        } else if (arg0.field2064 == null || arg0.field2064.trim().length() == 0) {
            return class203.field2973 ? "Hidden-use" : null;
        } else {
            return arg0.field2064;
        }
    }
}
