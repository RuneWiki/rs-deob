import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class44 {

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "Ljava/lang/String;")
    private String field601 = "null";

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "Z")
    public static boolean field605 = false;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "J")
    public static long field599 = 0L;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "Z")
    public static boolean field614 = false;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "Lid;")
    public static class224 field603 = new class224("", 14);

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "C")
    public char field609;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "C")
    public char field615;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    private int field602;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "Lcb;")
    public class78 field606;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "Lcb;")
    private class78 field607;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "[[Loh;")
    public static class549[][] field610;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IB)I", line = 3)
    public final int method383(int arg0, byte arg1) {
        if (arg1 <= 9) {
            this.field615 = 'z';
        }
        field600++;
        if (this.field606 == null) {
            return this.field602;
        } else {
            class264 var3 = (class264) this.field606.method740(0, (long) arg0);
            return var3 == null ? this.field602 : var3.field3841;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V", line = 25)
    private final void method384(byte arg0) {
        field598++;
        this.field607 = new class78(this.field606.method738((byte) -117));
        class264 var2 = (class264) this.field606.method734(0);
        if (arg0 != 40) {
            field603 = null;
        }
        while (var2 != null) {
            class264 var3 = new class264((int) var2.field1798);
            this.field607.method737((long) var2.field3841, (byte) 92, var3);
            var2 = (class264) this.field606.method736(-1);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 53)
    public final String method385(byte arg0, int arg1) {
        field608++;
        if (arg0 < 23) {
            return null;
        } else if (this.field606 == null) {
            return this.field601;
        } else {
            class172 var3 = (class172) this.field606.method740(0, (long) arg1);
            return var3 == null ? this.field601 : var3.field2499;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)Z", line = 77)
    public static final boolean method386(boolean arg0) {
        for (int var1 = class243.field3519; var1 < class146.field2246; var1++) {
            class184[][] var2 = class277.field4051[var1];
            for (int var3 = -class90.field1610; var3 <= 0; var3++) {
                int var4 = class119.field1913 + var3;
                int var5 = class119.field1913 - var3;
                if (var4 >= class225.field3359 || var5 < class387.field5759) {
                    for (int var6 = -class90.field1610; var6 <= 0; var6++) {
                        int var7 = class389.field5811 + var6;
                        int var8 = class389.field5811 - var6;
                        if (var4 >= class225.field3359) {
                            if (var7 >= class648.field9398) {
                                class184 var9 = var2[var4][var7];
                                if (var9 != null && var9.field2654) {
                                    class287.field4180 = arg0;
                                    class181.field2624.method854(true, var9);
                                    class181.field2624.method849((byte) -93);
                                }
                            }
                            if (var8 < class440.field6418) {
                                class184 var10 = var2[var4][var8];
                                if (var10 != null && var10.field2654) {
                                    class287.field4180 = arg0;
                                    class181.field2624.method854(true, var10);
                                    class181.field2624.method849((byte) -100);
                                }
                            }
                        }
                        if (var5 < class387.field5759) {
                            if (var7 >= class648.field9398) {
                                class184 var11 = var2[var5][var7];
                                if (var11 != null && var11.field2654) {
                                    class287.field4180 = arg0;
                                    class181.field2624.method854(true, var11);
                                    class181.field2624.method849((byte) -88);
                                }
                            }
                            if (var8 < class440.field6418) {
                                class184 var12 = var2[var5][var8];
                                if (var12 != null && var12.field2654) {
                                    class287.field4180 = arg0;
                                    class181.field2624.method854(true, var12);
                                    class181.field2624.method849((byte) -79);
                                }
                            }
                        }
                        if (class339.field4871 == 0) {
                            if (class58.field823) {
                                class181.field2624.method846((byte) 126, 24);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lco;II)V", line = 188)
    private final void method387(class268 arg0, int arg1, int arg2) {
        if (arg1 != 6) {
            this.field602 = 76;
        }
        if (arg2 == 1) {
            this.field615 = class149.method1074(arg0.method1714(-31536), -9345);
        } else if (arg2 == 2) {
            this.field609 = class149.method1074(arg0.method1714(-31536), -9345);
        } else if (arg2 == 3) {
            this.field601 = arg0.method1752(false);
        } else if (arg2 == 4) {
            this.field602 = arg0.method1748(arg1 - 128);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method1745(arg1 + 32126);
            this.field606 = new class78(class243.method1546(arg1 - 26373, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1748(117);
                class108 var7;
                if (arg2 == 5) {
                    var7 = new class172(arg0.method1752(false));
                } else {
                    var7 = new class264(arg0.method1748(105));
                }
                this.field606.method737((long) var6, (byte) 92, var7);
            }
        }
        field597++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 241)
    public final boolean method388(byte arg0, String arg1) {
        field611++;
        if (this.field606 == null) {
            return false;
        }
        if (this.field607 == null) {
            this.method391(5);
        }
        if (arg0 != -100) {
            this.method387(null, 2, 24);
        }
        for (class609 var3 = (class609) this.field607.method740(0, class225.method1499(arg1, 0)); var3 != null; var3 = (class609) this.field607.method741(-1)) {
            if (var3.field8661.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(Z)V", line = 274)
    public static void method389(boolean arg0) {
        field603 = null;
        if (!arg0) {
            method389(false);
        }
        field610 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILco;)V", line = 291)
    public final void method390(int arg0, class268 arg1) {
        while (true) {
            int var3 = arg1.method1738(255);
            if (var3 == 0) {
                if (arg0 != -1) {
                    field614 = false;
                }
                field612++;
                return;
            }
            this.method387(arg1, arg0 ^ 0xFFFFFFF9, var3);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V", line = 314)
    private final void method391(int arg0) {
        field613++;
        this.field607 = new class78(this.field606.method738((byte) 29));
        if (arg0 != 5) {
            this.method390(77, null);
        }
        for (class172 var2 = (class172) this.field606.method734(0); var2 != null; var2 = (class172) this.field606.method736(arg0 ^ 0xFFFFFFFA)) {
            class609 var3 = new class609(var2.field2499, (int) var2.field1798);
            this.field607.method737(class225.method1499(var2.field2499, 0), (byte) 92, var3);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZI)Z", line = 336)
    public final boolean method392(boolean arg0, int arg1) {
        field604++;
        if (this.field606 == null) {
            return false;
        } else if (arg0) {
            if (this.field607 == null) {
                this.method384((byte) 40);
            }
            class264 var3 = (class264) this.field607.method740(0, (long) arg1);
            return var3 != null;
        } else {
            return false;
        }
    }
}
