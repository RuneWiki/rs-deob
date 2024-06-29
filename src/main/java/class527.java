import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class527 {

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
    private int field7221 = 0;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "Loj;")
    private class346 field7222;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "Lia;")
    private class539 field7224;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Z)Z", line = 8)
    public static final boolean method2926(boolean arg0) {
        for (int var1 = class323.field4766; var1 < class552.field7467; var1++) {
            class486[][] var2 = class658.field9266[var1];
            for (int var3 = -class614.field8507; var3 <= 0; var3++) {
                int var4 = class532.field7247 + var3;
                int var5 = class532.field7247 - var3;
                if (var4 >= class380.field5354 || var5 < class426.field5996) {
                    for (int var6 = -class614.field8507; var6 <= 0; var6++) {
                        int var7 = class159.field2386 + var6;
                        int var8 = class159.field2386 - var6;
                        if (var4 >= class380.field5354) {
                            if (var7 >= class661.field9284) {
                                class486 var9 = var2[var4][var7];
                                if (var9 != null && var9.field6730) {
                                    class604.field8396 = arg0;
                                    class220.field3196.method2420(var9, (byte) 118);
                                    class220.field3196.method2421((byte) 112);
                                }
                            }
                            if (var8 < class116.field1549) {
                                class486 var10 = var2[var4][var8];
                                if (var10 != null && var10.field6730) {
                                    class604.field8396 = arg0;
                                    class220.field3196.method2420(var10, (byte) 118);
                                    class220.field3196.method2421((byte) 45);
                                }
                            }
                        }
                        if (var5 < class426.field5996) {
                            if (var7 >= class661.field9284) {
                                class486 var11 = var2[var5][var7];
                                if (var11 != null && var11.field6730) {
                                    class604.field8396 = arg0;
                                    class220.field3196.method2420(var11, (byte) 118);
                                    class220.field3196.method2421((byte) 47);
                                }
                            }
                            if (var8 < class116.field1549) {
                                class486 var12 = var2[var5][var8];
                                if (var12 != null && var12.field6730) {
                                    class604.field8396 = arg0;
                                    class220.field3196.method2420(var12, (byte) 118);
                                    class220.field3196.method2421((byte) 77);
                                }
                            }
                        }
                        if (class252.field3535 == 0) {
                            if (class507.field6949) {
                                class220.field3196.method2426(24, -4136);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)Lia;", line = 117)
    public final class539 method2927(byte arg0) {
        field7219++;
        if (this.field7221 > 0 && this.field7222.field4990[this.field7221 - 1] != this.field7224) {
            class539 var2 = this.field7224;
            this.field7224 = var2.field7315;
            return var2;
        }
        while (this.field7221 < this.field7222.field4999) {
            class539 var3 = this.field7222.field4990[this.field7221++].field7315;
            if (this.field7222.field4990[this.field7221 - 1] != var3) {
                this.field7224 = var3.field7315;
                return var3;
            }
        }
        if (arg0 > -76) {
            this.field7221 = -34;
        }
        return null;
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)Lia;", line = 152)
    public final class539 method2928(byte arg0) {
        int var2 = 107 / ((-arg0 - 8) / 32);
        field7220++;
        this.field7221 = 0;
        return this.method2927((byte) -119);
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V", line = 166)
    public class527() {
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Loj;)V", line = 168)
    public class527(class346 arg0) {
        this.field7222 = arg0;
    }
}
