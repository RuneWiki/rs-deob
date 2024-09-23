import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JFYFSKVR")
public class class22 {

    @OriginalMember(owner = "JFYFSKVR", name = "a", descriptor = "I")
    private int field756 = -261;

    @OriginalMember(owner = "JFYFSKVR", name = "b", descriptor = "I")
    private int field757 = -548;

    @OriginalMember(owner = "JFYFSKVR", name = "c", descriptor = "Z")
    private boolean field758 = true;

    @OriginalMember(owner = "JFYFSKVR", name = "k", descriptor = "I")
    public int field766 = -1;

    @OriginalMember(owner = "JFYFSKVR", name = "m", descriptor = "Z")
    public boolean field768 = false;

    @OriginalMember(owner = "JFYFSKVR", name = "n", descriptor = "I")
    public int field769 = 5;

    @OriginalMember(owner = "JFYFSKVR", name = "o", descriptor = "I")
    public int field770 = -1;

    @OriginalMember(owner = "JFYFSKVR", name = "p", descriptor = "I")
    public int field771 = -1;

    @OriginalMember(owner = "JFYFSKVR", name = "q", descriptor = "I")
    public int field772 = 99;

    @OriginalMember(owner = "JFYFSKVR", name = "r", descriptor = "I")
    public int field773 = -1;

    @OriginalMember(owner = "JFYFSKVR", name = "s", descriptor = "I")
    public int field774 = -1;

    @OriginalMember(owner = "JFYFSKVR", name = "t", descriptor = "I")
    public int field775 = 2;

    @OriginalMember(owner = "JFYFSKVR", name = "d", descriptor = "I")
    private static int field759 = -11;

    @OriginalMember(owner = "JFYFSKVR", name = "e", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "JFYFSKVR", name = "g", descriptor = "I")
    public int field762;

    @OriginalMember(owner = "JFYFSKVR", name = "u", descriptor = "I")
    public int field776;

    @OriginalMember(owner = "JFYFSKVR", name = "v", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "JFYFSKVR", name = "h", descriptor = "[I")
    public int[] field763;

    @OriginalMember(owner = "JFYFSKVR", name = "i", descriptor = "[I")
    public int[] field764;

    @OriginalMember(owner = "JFYFSKVR", name = "j", descriptor = "[I")
    private int[] field765;

    @OriginalMember(owner = "JFYFSKVR", name = "l", descriptor = "[I")
    public int[] field767;

    @OriginalMember(owner = "JFYFSKVR", name = "f", descriptor = "[LJFYFSKVR;")
    public static class22[] field761;

    @OriginalMember(owner = "JFYFSKVR", name = "a", descriptor = "(LCXFTMSCH;B)V")
    public static void method250(class8 arg0, byte arg1) {
        class33 var2 = new class33(true, arg0.method176("seq.dat", null));
        field760 = var2.method327();
        if (arg1 != 51) {
            field759 = -438;
        }
        if (field761 == null) {
            field761 = new class22[field760];
        }
        for (int var3 = 0; var3 < field760; var3++) {
            if (field761[var3] == null) {
                field761[var3] = new class22();
            }
            field761[var3].method252(var2, -261);
        }
    }

    @OriginalMember(owner = "JFYFSKVR", name = "a", descriptor = "(II)I")
    public int method251(int arg0, int arg1) {
        int var3 = this.field765[arg1];
        if (arg0 >= 0) {
            this.field758 = !this.field758;
        }
        if (var3 == 0) {
            class60 var4 = class60.method512(this.field757, this.field763[arg1]);
            if (var4 != null) {
                var3 = this.field765[arg1] = var4.field1416;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "JFYFSKVR", name = "a", descriptor = "(LMQZHAILV;I)V")
    public void method252(class33 arg0, int arg1) {
        label103: while (true) {
            if (arg1 >= 0) {
                int var7 = 1;
                while (true) {
                    if (var7 <= 0) {
                        continue label103;
                    }
                    var7++;
                }
            }
            while (true) {
                while (true) {
                    int var3 = arg0.method325();
                    if (var3 == 0) {
                        if (this.field762 == 0) {
                            this.field762 = 1;
                            this.field763 = new int[1];
                            this.field763[0] = -1;
                            this.field764 = new int[1];
                            this.field764[0] = -1;
                            this.field765 = new int[1];
                            this.field765[0] = -1;
                        }
                        if (this.field773 == -1) {
                            if (this.field767 == null) {
                                this.field773 = 0;
                            } else {
                                this.field773 = 2;
                            }
                        }
                        if (this.field774 == -1) {
                            if (this.field767 != null) {
                                this.field774 = 2;
                                return;
                            }
                            this.field774 = 0;
                            return;
                        }
                        return;
                    }
                    if (var3 == 1) {
                        this.field762 = arg0.method325();
                        this.field763 = new int[this.field762];
                        this.field764 = new int[this.field762];
                        this.field765 = new int[this.field762];
                        for (int var4 = 0; var4 < this.field762; var4++) {
                            this.field763[var4] = arg0.method327();
                            this.field764[var4] = arg0.method327();
                            if (this.field764[var4] == 65535) {
                                this.field764[var4] = -1;
                            }
                            this.field765[var4] = arg0.method327();
                        }
                    } else if (var3 == 2) {
                        this.field766 = arg0.method327();
                    } else if (var3 == 3) {
                        int var5 = arg0.method325();
                        this.field767 = new int[var5 + 1];
                        for (int var6 = 0; var6 < var5; var6++) {
                            this.field767[var6] = arg0.method325();
                        }
                        this.field767[var5] = 9999999;
                    } else if (var3 == 4) {
                        this.field768 = true;
                    } else if (var3 == 5) {
                        this.field769 = arg0.method325();
                    } else if (var3 == 6) {
                        this.field770 = arg0.method327();
                    } else if (var3 == 7) {
                        this.field771 = arg0.method327();
                    } else if (var3 == 8) {
                        this.field772 = arg0.method325();
                    } else if (var3 == 9) {
                        this.field773 = arg0.method325();
                    } else if (var3 == 10) {
                        this.field774 = arg0.method325();
                    } else if (var3 == 11) {
                        this.field775 = arg0.method325();
                    } else if (var3 == 12) {
                        this.field776 = arg0.method330();
                    } else {
                        System.out.println("Error unrecognised seq config code: " + var3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "JFYFSKVR", name = "<init>", descriptor = "()V")
    public class22() {
        if (class53.field1329) {
        }
    }
}
