import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class319 {

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "Lhb;")
    public static class250 field4108;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "Lpi;")
    public static class340 field4111;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "Lwt;")
    public static class16 field4112;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "Lhb;")
    public static class250 field4113;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public int field4104;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "Lqa;")
    public static class129 field4105;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "Lpd;")
    public class319 field4102;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "Loh;")
    public class448 field4107;

    static {
        new class169("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field4108 = new class250(64, 3);
        field4111 = new class340(47, -1);
        field4112 = new class16(5000);
        field4113 = new class250(50, 3);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 7)
    public final void method1898(int arg0) {
        field4110++;
        if (class242.field3110 >= 500) {
            return;
        }
        this.field4102 = class61.field801;
        this.field4107 = null;
        this.field4104 = arg0;
        class242.field3110++;
        class61.field801 = this;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILgf;)V", line = 24)
    public static final void method1899(int arg0, class395 arg1) {
        arg1.field5147 = false;
        field4101++;
        if (arg1.field5174 != -1) {
            class44 var2 = class403.field5429.method1962(arg1.field5174, false);
            if (var2 == null || var2.field640 == null) {
                arg1.field5174 = -1;
                arg1.field5196 = false;
            } else {
                label398: {
                    arg1.field5221++;
                    if (arg1.field5148 < var2.field640.length && var2.field647[arg1.field5148] < arg1.field5221) {
                        arg1.field5221 = 1;
                        arg1.field5181++;
                        arg1.field5148++;
                        class284.method1729(arg1.field6239, arg1.field5148, 86, arg1.field6220, arg1.field6241, var2, class37.field573 == arg1);
                    }
                    if (var2.field640.length <= arg1.field5148) {
                        arg1.field5148 = 0;
                        arg1.field5221 = 0;
                        if (arg1.field5196) {
                            arg1.field5174 = arg1.method2347((byte) -121).method2166(arg0 - 85);
                            if (arg1.field5174 == -1) {
                                arg1.field5196 = false;
                                break label398;
                            }
                            var2 = class403.field5429.method1962(arg1.field5174, false);
                        }
                        class284.method1729(arg1.field6239, arg1.field5148, 110, arg1.field6220, arg1.field6241, var2, class37.field573 == arg1);
                    }
                    arg1.field5181 = arg1.field5148 + 1;
                    if (var2.field640.length <= arg1.field5181) {
                        arg1.field5181 = 0;
                    }
                }
            }
        }
        if (arg1.field5204 != -1 && class264.field3353 >= arg1.field5155) {
            class76 var3 = class472.field6897.method1495((byte) 62, arg1.field5204);
            int var4 = var3.field969;
            if (var4 == -1) {
                arg1.field5204 = -1;
            } else {
                label400: {
                    class44 var5 = class403.field5429.method1962(var4, false);
                    if (var3.field964) {
                        if (var5.field654 == 3) {
                            if (arg1.field5252 > 0 && class264.field3353 >= arg1.field5228 && class264.field3353 > arg1.field5208) {
                                arg1.field5204 = -1;
                                break label400;
                            }
                        } else if (var5.field654 == 1 && arg1.field5252 > 0 && class264.field3353 >= arg1.field5228 && arg1.field5208 < class264.field3353) {
                            arg1.field5155 = class264.field3353 + 1;
                            break label400;
                        }
                    }
                    if (var5 == null || var5.field640 == null) {
                        arg1.field5204 = -1;
                    } else {
                        if (arg1.field5167 < 0) {
                            arg1.field5167 = 0;
                            class284.method1729(arg1.field6239, 0, arg0 + 87, arg1.field6220, arg1.field6241, var5, class37.field573 == arg1);
                        }
                        arg1.field5163++;
                        if (arg1.field5167 < var5.field640.length && arg1.field5163 > var5.field647[arg1.field5167]) {
                            arg1.field5163 = 1;
                            arg1.field5167++;
                            class284.method1729(arg1.field6239, arg1.field5167, 97, arg1.field6220, arg1.field6241, var5, class37.field573 == arg1);
                        }
                        if (arg1.field5167 >= var5.field640.length) {
                            if (var3.field964) {
                                arg1.field5178++;
                                arg1.field5167 -= var5.field657;
                                if (var5.field645 <= arg1.field5178) {
                                    arg1.field5204 = -1;
                                } else if (arg1.field5167 >= 0 && arg1.field5167 < var5.field640.length) {
                                    class284.method1729(arg1.field6239, arg1.field5167, 109, arg1.field6220, arg1.field6241, var5, class37.field573 == arg1);
                                } else {
                                    arg1.field5204 = -1;
                                }
                            } else {
                                arg1.field5204 = -1;
                            }
                        }
                        arg1.field5194 = arg1.field5167 + 1;
                        if (arg1.field5194 >= var5.field640.length) {
                            if (var3.field964) {
                                arg1.field5194 -= var5.field657;
                                if ((arg1.field5178 + 1) >= var5.field645) {
                                    arg1.field5194 = -1;
                                } else if (arg1.field5194 < 0 || arg1.field5194 >= var5.field640.length) {
                                    arg1.field5194 = -1;
                                }
                            } else {
                                arg1.field5194 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field5172 != -1 && class264.field3353 >= arg1.field5198) {
            class76 var6 = class472.field6897.method1495((byte) 62, arg1.field5172);
            int var7 = var6.field969;
            if (var7 == -1) {
                arg1.field5172 = -1;
            } else {
                label403: {
                    class44 var8 = class403.field5429.method1962(var7, false);
                    if (var6.field964) {
                        if (var8.field654 == 3) {
                            if (arg1.field5252 > 0 && class264.field3353 >= arg1.field5228 && arg1.field5208 < class264.field3353) {
                                arg1.field5172 = -1;
                                break label403;
                            }
                        } else if (var8.field654 == 1 && arg1.field5252 > 0 && class264.field3353 >= arg1.field5228 && arg1.field5208 < class264.field3353) {
                            arg1.field5198 = class264.field3353 + 1;
                            break label403;
                        }
                    }
                    if (var8 == null || var8.field640 == null) {
                        arg1.field5172 = -1;
                    } else {
                        if (arg1.field5206 < 0) {
                            arg1.field5206 = 0;
                            class284.method1729(arg1.field6239, 0, 93, arg1.field6220, arg1.field6241, var8, class37.field573 == arg1);
                        }
                        arg1.field5238++;
                        if (arg1.field5206 < var8.field640.length && var8.field647[arg1.field5206] < arg1.field5238) {
                            arg1.field5238 = 1;
                            arg1.field5206++;
                            class284.method1729(arg1.field6239, arg1.field5206, 87, arg1.field6220, arg1.field6241, var8, class37.field573 == arg1);
                        }
                        if (var8.field640.length <= arg1.field5206) {
                            if (var6.field964) {
                                arg1.field5170++;
                                arg1.field5206 -= var8.field657;
                                if (var8.field645 <= arg1.field5170) {
                                    arg1.field5172 = -1;
                                } else if (arg1.field5206 >= 0 && arg1.field5206 < var8.field640.length) {
                                    class284.method1729(arg1.field6239, arg1.field5206, arg0 + 114, arg1.field6220, arg1.field6241, var8, class37.field573 == arg1);
                                } else {
                                    arg1.field5172 = -1;
                                }
                            } else {
                                arg1.field5172 = -1;
                            }
                        }
                        arg1.field5186 = arg1.field5206 + 1;
                        if (arg1.field5186 >= var8.field640.length) {
                            if (var6.field964) {
                                arg1.field5186 -= var8.field657;
                                if (arg1.field5170 + 1 >= var8.field645) {
                                    arg1.field5186 = -1;
                                } else if (arg1.field5186 < 0 || arg1.field5186 >= var8.field640.length) {
                                    arg1.field5186 = -1;
                                }
                            } else {
                                arg1.field5186 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field5191 != -1 && arg1.field5177 <= 1) {
            class44 var9 = class403.field5429.method1962(arg1.field5191, false);
            if (var9.field654 == 3) {
                if (arg1.field5252 > 0 && class264.field3353 >= arg1.field5228 && class264.field3353 > arg1.field5208) {
                    arg1.field5191 = -1;
                }
            } else if (var9.field654 == 1 && arg1.field5252 > 0 && class264.field3353 >= arg1.field5228 && class264.field3353 > arg1.field5208) {
                arg1.field5177 = 2;
            }
        }
        if (arg1.field5191 != -1 && arg1.field5177 == 0) {
            class44 var10 = class403.field5429.method1962(arg1.field5191, false);
            if (var10 == null || var10.field640 == null) {
                arg1.field5191 = -1;
            } else {
                arg1.field5180++;
                if (arg1.field5176 < var10.field640.length && arg1.field5180 > var10.field647[arg1.field5176]) {
                    arg1.field5176++;
                    arg1.field5180 = 1;
                    class284.method1729(arg1.field6239, arg1.field5176, arg0 ^ 0xFFFFFFA3, arg1.field6220, arg1.field6241, var10, class37.field573 == arg1);
                }
                if (arg1.field5176 >= var10.field640.length) {
                    arg1.field5225++;
                    arg1.field5176 -= var10.field657;
                    if (arg1.field5225 >= var10.field645) {
                        arg1.field5191 = -1;
                    } else if (arg1.field5176 >= 0 && arg1.field5176 < var10.field640.length) {
                        class284.method1729(arg1.field6239, arg1.field5176, arg0 ^ 0xFFFFFF8D, arg1.field6220, arg1.field6241, var10, class37.field573 == arg1);
                    } else {
                        arg1.field5191 = -1;
                    }
                }
                arg1.field5233 = arg1.field5176 + 1;
                if (var10.field640.length <= arg1.field5233) {
                    arg1.field5233 -= var10.field657;
                    if (arg1.field5225 + 1 >= var10.field645) {
                        arg1.field5233 = -1;
                    } else if (arg1.field5233 < 0 || var10.field640.length <= arg1.field5233) {
                        arg1.field5233 = -1;
                    }
                }
                arg1.field5147 = var10.field653;
            }
        }
        if (~arg1.field5177 < arg0) {
            arg1.field5177--;
        }
        for (int var11 = 0; var11 < arg1.field5183.length; var11++) {
            class447 var12 = arg1.field5183[var11];
            if (var12 != null) {
                if (var12.field6212 > 0) {
                    var12.field6212--;
                } else {
                    class44 var13 = class403.field5429.method1962(var12.field6218, false);
                    if (var13 == null || var13.field640 == null) {
                        arg1.field5183[var11] = null;
                    } else {
                        var12.field6214++;
                        if (var12.field6210 < var13.field640.length && var13.field647[var12.field6210] < var12.field6214) {
                            var12.field6210++;
                            var12.field6214 = 1;
                            class284.method1729(arg1.field6239, var12.field6210, 116, arg1.field6220, arg1.field6241, var13, class37.field573 == arg1);
                        }
                        if (var13.field640.length <= var12.field6210) {
                            var12.field6215++;
                            var12.field6210 -= var13.field657;
                            if (var12.field6215 >= var13.field645) {
                                arg1.field5183[var11] = null;
                            } else if (var12.field6210 >= 0 && var12.field6210 < var13.field640.length) {
                                class284.method1729(arg1.field6239, var12.field6210, arg0 ^ 0xFFFFFF90, arg1.field6220, arg1.field6241, var13, class37.field573 == arg1);
                            } else {
                                arg1.field5183[var11] = null;
                            }
                        }
                        var12.field6219 = var12.field6210 + 1;
                        if (var12.field6219 >= var13.field640.length) {
                            var12.field6219 -= var13.field657;
                            if (var13.field645 <= var12.field6215 + 1) {
                                var12.field6219 = -1;
                            } else if (var12.field6219 < 0 || var12.field6219 >= var13.field640.length) {
                                var12.field6219 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ldn;Ldn;ILdn;Ldn;)V", line = 448)
    public static final void method1900(class201 arg0, class201 arg1, int arg2, class201 arg3, class201 arg4) {
        field4100++;
        class202.field2646 = arg4;
        class47.field681 = arg1;
        class356.field4569 = arg3;
        class338.field4322 = arg0;
        class296.field3842 = new class423[class47.field681.method1309((byte) 31)][];
        if (arg2 != 0) {
            field4103 = 87;
        }
        class54.field737 = new boolean[class47.field681.method1309((byte) 31)];
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V", line = 466)
    public static void method1901(byte arg0) {
        field4105 = null;
        field4108 = null;
        field4111 = null;
        field4112 = null;
        field4113 = null;
        if (arg0 > -73) {
            method1899(67, null);
        }
    }
}
