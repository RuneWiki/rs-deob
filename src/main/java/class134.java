import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class134 extends class580 {

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "[I")
    public static int[] field1509 = new int[8];

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
    public static int field1515 = 0;

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "I")
    public int field1508;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "Lqn;")
    public class59 field1512;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "[B")
    public byte[] field1513;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILlt;)V", line = 10)
    public static final void method748(int arg0, class617 arg1) {
        ++field1514;
        arg1.method3459((byte) -116);
        int var2 = 0;
        for (int var3 = 0; ~var3 > ~class11.field111; ++var3) {
            int var15 = class79.field827[var3];
            if (~(class173.field2062[var15] & 1) == -1) {
                if (~var2 < -1) {
                    class173.field2062[var15] = (byte) class139.method776(class173.field2062[var15], 2);
                    --var2;
                } else {
                    int var16 = arg1.method3465(1, (byte) -109);
                    if (~var16 == -1) {
                        var2 = class77.method482(83, arg1);
                        class173.field2062[var15] = (byte) class139.method776(class173.field2062[var15], 2);
                    } else {
                        class588.method3303(var15, -1, arg1);
                    }
                }
            }
        }
        arg1.method3463((byte) 104);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        } else {
            arg1.method3459((byte) -116);
            for (int var4 = 0; var4 < class11.field111; ++var4) {
                int var13 = class79.field827[var4];
                if (~(class173.field2062[var13] & 1) != -1) {
                    if (var2 > 0) {
                        --var2;
                        class173.field2062[var13] = (byte) class139.method776(class173.field2062[var13], 2);
                    } else {
                        int var14 = arg1.method3465(1, (byte) -100);
                        if (var14 == 0) {
                            var2 = class77.method482(95, arg1);
                            class173.field2062[var13] = (byte) class139.method776(class173.field2062[var13], 2);
                        } else {
                            class588.method3303(var13, -1, arg1);
                        }
                    }
                }
            }
            arg1.method3463((byte) 104);
            if (~var2 != -1) {
                throw new RuntimeException("nsn1");
            } else {
                arg1.method3459((byte) -116);
                for (int var5 = 0; ~class548.field7833 < ~var5; ++var5) {
                    int var11 = class324.field4223[var5];
                    if (~(class173.field2062[var11] & 1) != -1) {
                        if (~var2 < -1) {
                            class173.field2062[var11] = (byte) class139.method776(class173.field2062[var11], 2);
                            --var2;
                        } else {
                            int var12 = arg1.method3465(1, (byte) -80);
                            if (~var12 == -1) {
                                var2 = class77.method482(108, arg1);
                                class173.field2062[var11] = (byte) class139.method776(class173.field2062[var11], 2);
                            } else if (class632.method3538(var11, -41, arg1)) {
                                class173.field2062[var11] = (byte) class139.method776(class173.field2062[var11], 2);
                            }
                        }
                    }
                }
                arg1.method3463((byte) 104);
                if (var2 != 0) {
                    throw new RuntimeException("nsn2");
                } else {
                    if (arg0 <= 89) {
                        field1509 = null;
                    }
                    arg1.method3459((byte) -116);
                    for (int var6 = 0; class548.field7833 > var6; ++var6) {
                        int var9 = class324.field4223[var6];
                        if ((class173.field2062[var9] & 1) == 0) {
                            if (~var2 < -1) {
                                --var2;
                                class173.field2062[var9] = (byte) class139.method776(class173.field2062[var9], 2);
                            } else {
                                int var10 = arg1.method3465(1, (byte) -82);
                                if (~var10 == -1) {
                                    var2 = class77.method482(60, arg1);
                                    class173.field2062[var9] = (byte) class139.method776(class173.field2062[var9], 2);
                                } else if (class632.method3538(var9, -64, arg1)) {
                                    class173.field2062[var9] = (byte) class139.method776(class173.field2062[var9], 2);
                                }
                            }
                        }
                    }
                    arg1.method3463((byte) 104);
                    if (var2 != 0) {
                        throw new RuntimeException("nsn3");
                    } else {
                        class548.field7833 = 0;
                        class11.field111 = 0;
                        for (int var7 = 1; var7 < 2048; ++var7) {
                            class173.field2062[var7] = (byte) (class173.field2062[var7] >> 1);
                            class455 var8 = class362.field4726[var7];
                            if (var8 == null) {
                                class324.field4223[class548.field7833++] = var7;
                            } else {
                                class79.field827[class11.field111++] = var7;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)I", line = 216)
    public final int method749(int arg0) {
        ++field1507;
        if (arg0 != 30849) {
            method748(114, (class617) null);
        }
        return super.field8252 ? 0 : 100;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)[B", line = 234)
    public final byte[] method750(int arg0) {
        int var2 = 54 % ((8 - arg0) / 58);
        ++field1511;
        if (super.field8252) {
            throw new RuntimeException();
        } else {
            return this.field1513;
        }
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V", line = 266)
    public static void method751(int arg0) {
        field1509 = null;
        if (arg0 != -1) {
            method748(-91, (class617) null);
        }
    }
}
