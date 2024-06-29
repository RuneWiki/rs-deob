import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public class class96 {

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "Loo;")
    public static class629 field1357 = new class629(14, 4);

    @OriginalMember(owner = "client!pia", name = "e", descriptor = "I")
    public static int field1360 = 0;

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!pia", name = "c", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!pia", name = "d", descriptor = "Lgh;")
    public class550 field1359;

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(BLns;)V")
    public static final void method747(byte arg0, class405 arg1) {
        if (arg1.field6123 != -1) {
            class288 var2 = class742.field10404.method2663(0, arg1.field6123);
            if (var2 == null || var2.field4081 == null) {
                arg1.field6032 = false;
                arg1.field6123 = -1;
            } else {
                label366: {
                    arg1.field6034++;
                    if (arg1.field6076 < var2.field4081.length && var2.field4087[arg1.field6076] < arg1.field6034) {
                        arg1.field6075++;
                        arg1.field6034 = 1;
                        arg1.field6076++;
                        if (!arg1.field6095) {
                            class294.method1865(arg1.field6076, arg1, var2, -114);
                        }
                    }
                    if (var2.field4081.length <= arg1.field6076) {
                        arg1.field6034 = 0;
                        arg1.field6076 = 0;
                        if (arg1.field6032) {
                            arg1.field6123 = arg1.method2577(-1).method1699(false);
                            if (arg1.field6123 == -1) {
                                arg1.field6032 = false;
                                break label366;
                            }
                            var2 = class742.field10404.method2663(arg0 ^ 0xFFFFFF9F, arg1.field6123);
                        }
                        if (!arg1.field6095) {
                            class294.method1865(arg1.field6076, arg1, var2, -79);
                        }
                    }
                    arg1.field6075 = arg1.field6076 + 1;
                    if (var2.field4081 == null) {
                        arg1.field6123 = -1;
                        arg1.field6032 = false;
                    } else if (var2.field4081.length <= arg1.field6075) {
                        arg1.field6075 = 0;
                    }
                }
            }
        }
        field1356++;
        if (arg1.field6061 != -1 && class357.field5189 >= arg1.field6102) {
            class321 var3 = class499.field7100.method172(arg1.field6061, arg0 ^ 0xFFFFF3A7);
            int var4 = var3.field4528;
            if (var4 == -1) {
                arg1.field6061 = -1;
            } else {
                label367: {
                    class288 var5 = class742.field10404.method2663(0, var4);
                    if (var3.field4543) {
                        if (var5.field4083 == 3) {
                            if (arg1.field6134 > 0 && class357.field5189 >= arg1.field6052 && arg1.field6100 < class357.field5189) {
                                arg1.field6061 = -1;
                                break label367;
                            }
                        } else if (var5.field4083 == 1 && arg1.field6134 > 0 && arg1.field6052 <= class357.field5189 && arg1.field6100 < class357.field5189) {
                            arg1.field6102 = class357.field5189 + 1;
                            break label367;
                        }
                    }
                    if (var5 == null || var5.field4081 == null) {
                        arg1.field6061 = -1;
                    } else {
                        if (arg1.field6046 < 0) {
                            arg1.field6046 = 0;
                            if (!arg1.field6095) {
                                class294.method1865(0, arg1, var5, -62);
                            }
                        }
                        arg1.field6055++;
                        if (var5.field4081.length > arg1.field6046 && arg1.field6055 > var5.field4087[arg1.field6046]) {
                            arg1.field6055 = 1;
                            arg1.field6046++;
                            if (!arg1.field6095) {
                                class294.method1865(arg1.field6046, arg1, var5, -67);
                            }
                        }
                        if (arg1.field6046 >= var5.field4081.length) {
                            if (var3.field4543) {
                                arg1.field6046 -= var5.field4082;
                                arg1.field6109++;
                                if (arg1.field6109 >= var5.field4100) {
                                    arg1.field6061 = -1;
                                } else if (arg1.field6046 < 0 || arg1.field6046 >= var5.field4081.length) {
                                    arg1.field6061 = -1;
                                } else if (!arg1.field6095) {
                                    class294.method1865(arg1.field6046, arg1, var5, -70);
                                }
                            } else {
                                arg1.field6061 = -1;
                            }
                        }
                        arg1.field6049 = arg1.field6046 + 1;
                        if (arg1.field6049 >= var5.field4081.length) {
                            if (var3.field4543) {
                                arg1.field6049 -= var5.field4082;
                                if (arg1.field6109 + 1 >= var5.field4100) {
                                    arg1.field6049 = -1;
                                } else if (arg1.field6049 < 0 || var5.field4081.length <= arg1.field6049) {
                                    arg1.field6049 = -1;
                                }
                            } else {
                                arg1.field6049 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field6107 != -1 && arg1.field6022 <= class357.field5189) {
            class321 var6 = class499.field7100.method172(arg1.field6107, 3128);
            int var7 = var6.field4528;
            if (var7 == -1) {
                arg1.field6107 = -1;
            } else {
                label370: {
                    class288 var8 = class742.field10404.method2663(0, var7);
                    if (var6.field4543) {
                        if (var8.field4083 == 3) {
                            if (arg1.field6134 > 0 && class357.field5189 >= arg1.field6052 && class357.field5189 > arg1.field6100) {
                                arg1.field6107 = -1;
                                break label370;
                            }
                        } else if (var8.field4083 == 1 && arg1.field6134 > 0 && class357.field5189 >= arg1.field6052 && class357.field5189 > arg1.field6100) {
                            arg1.field6022 = class357.field5189 + 1;
                            break label370;
                        }
                    }
                    if (var8 == null || var8.field4081 == null) {
                        arg1.field6107 = -1;
                    } else {
                        if (arg1.field6087 < 0) {
                            arg1.field6087 = 0;
                            if (!arg1.field6095) {
                                class294.method1865(0, arg1, var8, -34);
                            }
                        }
                        arg1.field6028++;
                        if (arg1.field6087 < var8.field4081.length && var8.field4087[arg1.field6087] < arg1.field6028) {
                            arg1.field6028 = 1;
                            arg1.field6087++;
                            if (!arg1.field6095) {
                                class294.method1865(arg1.field6087, arg1, var8, arg0 ^ 0x7E);
                            }
                        }
                        if (var8.field4081.length <= arg1.field6087) {
                            if (var6.field4543) {
                                arg1.field6087 -= var8.field4082;
                                arg1.field6080++;
                                if (arg1.field6080 >= var8.field4100) {
                                    arg1.field6107 = -1;
                                } else if (arg1.field6087 < 0 || var8.field4081.length <= arg1.field6087) {
                                    arg1.field6107 = -1;
                                } else if (!arg1.field6095) {
                                    class294.method1865(arg1.field6087, arg1, var8, -23);
                                }
                            } else {
                                arg1.field6107 = -1;
                            }
                        }
                        arg1.field6084 = arg1.field6087 + 1;
                        if (arg1.field6084 >= var8.field4081.length) {
                            if (var6.field4543) {
                                arg1.field6084 -= var8.field4082;
                                if (var8.field4100 <= arg1.field6080 + 1) {
                                    arg1.field6084 = -1;
                                } else if (arg1.field6084 < 0 || arg1.field6084 >= var8.field4081.length) {
                                    arg1.field6084 = -1;
                                }
                            } else {
                                arg1.field6084 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field6094 != -1 && arg1.field6056 <= 1) {
            class288 var9 = class742.field10404.method2663(arg0 + 97, arg1.field6094);
            if (var9.field4083 == 3) {
                if (arg1.field6134 > 0 && arg1.field6052 <= class357.field5189 && class357.field5189 > arg1.field6100) {
                    arg1.field6094 = -1;
                    arg1.field6039 = null;
                }
            } else if (var9.field4083 == 1 && arg1.field6134 > 0 && class357.field5189 >= arg1.field6052 && arg1.field6100 < class357.field5189) {
                arg1.field6056 = 2;
            }
        }
        if (arg1.field6094 != -1 && arg1.field6056 == 0) {
            class288 var10 = class742.field10404.method2663(0, arg1.field6094);
            if (var10 == null || var10.field4081 == null) {
                arg1.field6094 = -1;
                arg1.field6039 = null;
            } else {
                arg1.field6038++;
                if (var10.field4081.length > arg1.field6040 && var10.field4087[arg1.field6040] < arg1.field6038) {
                    arg1.field6038 = 1;
                    arg1.field6040++;
                    if (!arg1.field6095) {
                        class294.method1865(arg1.field6040, arg1, var10, arg0 ^ 0x16);
                    }
                }
                if (arg1.field6040 >= var10.field4081.length) {
                    arg1.field6040 -= var10.field4082;
                    arg1.field6117++;
                    if (arg1.field6117 >= var10.field4100) {
                        arg1.field6094 = -1;
                        arg1.field6039 = null;
                    } else if (arg1.field6040 < 0 || arg1.field6040 >= var10.field4081.length) {
                        arg1.field6094 = -1;
                        arg1.field6039 = null;
                    } else if (!arg1.field6095) {
                        class294.method1865(arg1.field6040, arg1, var10, -92);
                    }
                }
                arg1.field6091 = arg1.field6040 + 1;
                if (arg1.field6091 >= var10.field4081.length) {
                    arg1.field6091 -= var10.field4082;
                    if (var10.field4100 <= arg1.field6117 + 1) {
                        arg1.field6091 = -1;
                    } else if (arg1.field6091 < 0 || var10.field4081.length <= arg1.field6091) {
                        arg1.field6091 = -1;
                    }
                }
            }
        }
        if (arg1.field6056 > 0) {
            arg1.field6056--;
        }
        for (int var11 = 0; var11 < arg1.field6116.length; var11++) {
            class75 var12 = arg1.field6116[var11];
            if (var12 != null) {
                if (var12.field1042 > 0) {
                    var12.field1042--;
                } else {
                    class288 var13 = class742.field10404.method2663(0, var12.field1046);
                    if (var13 == null || var13.field4081 == null) {
                        arg1.field6116[var11] = null;
                    } else {
                        var12.field1045++;
                        if (var13.field4081.length > var12.field1043 && var12.field1045 > var13.field4087[var12.field1043]) {
                            var12.field1043++;
                            var12.field1045 = 1;
                            if (!arg1.field6095) {
                                class294.method1865(var12.field1043, arg1, var13, arg0 + 72);
                            }
                        }
                        if (var12.field1043 >= var13.field4081.length) {
                            var12.field1048++;
                            var12.field1043 -= var13.field4082;
                            if (var13.field4100 <= var12.field1048) {
                                arg1.field6116[var11] = null;
                            } else if (var12.field1043 < 0 || var13.field4081.length <= var12.field1043) {
                                arg1.field6116[var11] = null;
                            } else if (!arg1.field6095) {
                                class294.method1865(var12.field1043, arg1, var13, arg0 + 44);
                            }
                        }
                        var12.field1047 = var12.field1043 + 1;
                        if (var13.field4081.length <= var12.field1047) {
                            var12.field1047 -= var13.field4082;
                            if (var13.field4100 <= (var12.field1048 + 1)) {
                                var12.field1047 = -1;
                            } else if (var12.field1047 < 0 || var13.field4081.length <= var12.field1047) {
                                var12.field1047 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != -97) {
            field1357 = null;
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(Z)V")
    public static void method748(boolean arg0) {
        field1357 = null;
        if (!arg0) {
            method749(false, 100, 65);
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(ZII)Z")
    public static final boolean method749(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field1358++;
            return class399.method2535(500, arg2, arg1) & class262.method1693(arg2, (byte) 125, arg1);
        } else {
            return true;
        }
    }
}
