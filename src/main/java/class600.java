import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class600 extends RuntimeException {

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field8460;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "Ljava/lang/String;")
    public String field8459;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "[I")
    public static int[] field8461 = new int[6];

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "Lga;")
    public static class420 field8464 = new class420();

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
    public static int field8462;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
    public static int field8463;

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "I")
    public static int field8465;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V", line = 4)
    public static final void method3470(byte arg0) {
        field8463++;
        if (class312.field4645 != null) {
            class312.field4645.method450(1);
            class483.field6862 = null;
            class312.field4645 = null;
        }
        if (arg0 < 115) {
            field8464 = null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V", line = 32)
    public static void method3471(int arg0) {
        field8464 = null;
        if (arg0 != -11770) {
            field8461 = null;
        }
        field8461 = null;
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 43)
    public class600(Throwable arg0, String arg1) {
        this.field8460 = arg0;
        this.field8459 = arg1;
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)I", line = 52)
    public static final int method3472(int arg0) {
        field8462++;
        if (class169.field2433 == null) {
            if (!class422.field5962 && class50.field723 != null) {
                return class50.field723.field4637;
            }
            int var1 = class694.field9812.method3201((byte) 44);
            int var2 = class694.field9812.method3197((byte) -124);
            if (class102.field1282) {
                if (class505.field7233 < var1 && class611.field8627 + class505.field7233 > var1) {
                    int var10 = -1;
                    for (int var11 = 0; var11 < class27.field394; var11++) {
                        if (class102.field1283) {
                            int var16 = var11 * 16 + class761.field10487 + 33;
                            if (var2 > (var16 - 13) && var2 <= var16 + 3) {
                                var10 = var11;
                            }
                        } else {
                            int var15 = var11 * 16 + class761.field10487 + 31;
                            if (var2 > (var15 - 13) && var2 <= var15 + 3) {
                                var10 = var11;
                            }
                        }
                    }
                    if (var10 != -1) {
                        int var12 = 0;
                        class775 var13 = new class775(class174.field2456);
                        for (class4 var14 = (class4) var13.method4250(10581); var14 != null; var14 = (class4) var13.method4249((byte) 119)) {
                            if (var12++ == var10) {
                                return ((class312) var14.field46.field5842.field3126).field4637;
                            }
                        }
                    }
                } else if (class569.field8059 != null && class209.field3041 < var1 && class209.field3041 + class126.field1652 > var1) {
                    int var17 = -1;
                    for (int var18 = 0; var18 < class569.field8059.field49; var18++) {
                        if (class102.field1283) {
                            int var23 = class149.field1906 + (var18 * 16) + 33;
                            if ((var23 - 13) < var2 && (var23 + 3) >= var2) {
                                var17 = var18;
                            }
                        } else {
                            int var22 = var18 * 16 + (class149.field1906 + 31);
                            if (var22 - 13 < var2 && (var22 + 3) >= var2) {
                                var17 = var18;
                            }
                        }
                    }
                    if (var17 != -1) {
                        int var19 = 0;
                        class775 var20 = new class775(class569.field8059.field46);
                        for (class312 var21 = (class312) var20.method4250(10581); var21 != null; var21 = (class312) var20.method4249((byte) 115)) {
                            if ((var19++) == var17) {
                                return var21.field4637;
                            }
                        }
                    }
                }
            } else if (var1 > class505.field7233 && var1 < (class611.field8627 + class505.field7233)) {
                int var3 = -1;
                for (int var4 = 0; var4 < class543.field7608; var4++) {
                    if (class102.field1283) {
                        int var8 = class761.field10487 + ((class543.field7608 - var4 - 1) * 16) + 33;
                        if (var2 > (var8 - 13) && var2 <= var8 + 3) {
                            var3 = var4;
                        }
                    } else {
                        int var9 = (class543.field7608 - var4 - 1) * 16 + class761.field10487 + 31;
                        if ((var9 - 13) < var2 && (var9 + 3) >= var2) {
                            var3 = var4;
                        }
                    }
                }
                if (var3 != -1) {
                    int var5 = 0;
                    class221 var6 = new class221(class551.field7826);
                    for (class312 var7 = (class312) var6.method1527(true); var7 != null; var7 = (class312) var6.method1525(7064)) {
                        if (var5++ == var3) {
                            return var7.field4637;
                        }
                    }
                }
            }
        }
        return arg0 == -13 ? -1 : -126;
    }
}
