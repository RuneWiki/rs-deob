import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class41 implements Runnable {

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "Z")
    public boolean field808 = true;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "Ljava/lang/Object;")
    public Object field812 = new Object();

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "[I")
    public int[] field820 = new int[500];

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "[I")
    public int[] field823 = new int[500];

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public int field819 = 0;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field813 = 0;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field811 = 0;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field814 = 0;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "Lw;")
    public static class198 field817;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "[Lgf;")
    public static class61[] field822;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "[[[I")
    public static int[][][] field821;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static void method351(int arg0) {
        field817 = null;
        field822 = null;
        if (arg0 != -100) {
            method354(91, -8);
        }
        field821 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public static final void method352(byte arg0) {
        field816++;
        if (arg0 > -122) {
            return;
        }
        for (int var1 = 0; var1 < class35.field688; var1++) {
            int var10002 = class100.field2106[var1]--;
            if (class100.field2106[var1] >= -10) {
                class112 var3 = class52.field997[var1];
                if (var3 == null) {
                    var3 = class112.method891(class147.field2882, class21.field398[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class100.field2106[var1] += var3.method890();
                    class52.field997[var1] = var3;
                }
                if (class100.field2106[var1] < 0) {
                    int var4;
                    if (class110.field2273[var1] == 0) {
                        var4 = class60.field1169;
                    } else {
                        int var5 = (class110.field2273[var1] & 0xFF) * 128;
                        int var6 = class110.field2273[var1] >> 16 & 0xFF;
                        int var7 = class110.field2273[var1] >> 8 & 0xFF;
                        int var8 = var6 * 128 + 64 - class123.field2489.field3291;
                        int var9 = var7 * 128 + 64 - class123.field2489.field3281;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var10 = var8 + var9 - 128;
                        if (var5 < var10) {
                            class100.field2106[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class159.field3099 / var5;
                    }
                    if (var4 > 0) {
                        class104 var11 = var3.method892().method847(field817);
                        class15 var12 = class15.method130(var11, 100, var4);
                        var12.method159(client.field553[var1] - 1);
                        class182.field3491.method1174(var12);
                    }
                    class100.field2106[var1] = -100;
                }
            } else {
                class35.field688--;
                for (int var2 = var1; var2 < class35.field688; var2++) {
                    class21.field398[var2] = class21.field398[var2 + 1];
                    class52.field997[var2] = class52.field997[var2 + 1];
                    client.field553[var2] = client.field553[var2 + 1];
                    class100.field2106[var2] = class100.field2106[var2 + 1];
                    class110.field2273[var2] = class110.field2273[var2 + 1];
                }
                var1--;
            }
        }
        if (class72.field1545 && !class96.method768((byte) -116)) {
            if (class146.field2855 != 0 && class107.field2235 != -1) {
                class79.method677(false, class107.field2235, 0, 111, class189.field3667, class146.field2855);
            }
            class72.field1545 = false;
        } else if (class146.field2855 != 0 && class107.field2235 != -1 && !class96.method768((byte) -120)) {
            class198.field3859++;
            class60.field1174.method657(28182, 40);
            class60.field1174.method606(class107.field2235, -1424429928);
            class107.field2235 = -1;
        }
    }

    @OriginalMember(owner = "client!eb", name = "run", descriptor = "()V")
    public final void run() {
        field818++;
        while (this.field808) {
            Object var1 = this.field812;
            synchronized (this.field812) {
                if (this.field819 < 500) {
                    this.field823[this.field819] = class84.field1788;
                    this.field820[this.field819] = field814;
                    this.field819++;
                }
            }
            class76.method666(50L, 1);
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
    public static final void method353(int arg0) {
        field815++;
        for (int var1 = 0; var1 < class80.field1727; var1++) {
            int var2 = class136.field2666[var1];
            class72 var3 = class133.field2626[var2];
            if (var3 != null) {
                class2.method5(var3, (byte) -89, var3.field1547.field1111);
            }
        }
        if (arg0 != 128) {
            method353(77);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Z")
    public static final boolean method354(int arg0, int arg1) {
        field810++;
        if (arg0 < 32) {
            return false;
        }
        int var2 = 118 % ((-arg1 - 12) / 50);
        if (arg0 == 127) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }
}
