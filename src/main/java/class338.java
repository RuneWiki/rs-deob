import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class338 extends class136 {

    @OriginalMember(owner = "client!kp", name = "C", descriptor = "I")
    private int field4685 = 4096;

    @OriginalMember(owner = "client!kp", name = "E", descriptor = "I")
    private int field4687 = 4096;

    @OriginalMember(owner = "client!kp", name = "K", descriptor = "I")
    private int field4692 = 4096;

    @OriginalMember(owner = "client!kp", name = "J", descriptor = "I")
    public static int field4691 = 0;

    @OriginalMember(owner = "client!kp", name = "D", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!kp", name = "G", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!kp", name = "H", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!kp", name = "I", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(B)V", line = 4)
    public static final void method2056(byte arg0) {
        ++field4686;
        if (~class380.field5618 > -103) {
            class380.field5618 += 6;
        }
        if (~class124.field1814 != -1) {
            class7.field88 -= class124.field1814 * 5;
            if (~class209.field3033 >= ~class7.field88) {
                class7.field88 = class209.field3033 + -1;
            }
            class124.field1814 = 0;
            if (class7.field88 < 0) {
                class7.field88 = 0;
            }
        }
        for (int var1 = 0; ~class484.field7122 < ~var1; ++var1) {
            int var2 = class386.field5678[var1].method701((byte) 126);
            char var3 = class386.field5678[var1].method704(2);
            if (var2 == 84) {
                class398.method2436(122);
            } else if (class229.field3360.method796(-120, 82) && var2 == 66) {
                if (class175.field2486 != null) {
                    String var4 = "";
                    for (int var5 = class474.field6989.length + -1; var5 >= 0; --var5) {
                        if (class474.field6989[var5] != null && ~class474.field6989[var5].length() < -1) {
                            var4 = var4 + class474.field6989[var5] + '\n';
                        }
                    }
                    class175.field2486.setContents(new StringSelection(var4), (ClipboardOwner) null);
                }
            } else if (class229.field3360.method796(-114, 82) && var2 == 67) {
                if (class175.field2486 != null) {
                    Transferable var6 = class175.field2486.getContents((Object) null);
                    if (var6 != null) {
                        try {
                            String var7 = (String) var6.getTransferData(DataFlavor.stringFlavor);
                            if (var7 != null) {
                                String[] var8 = class92.method817((byte) -87, var7, '\n');
                                if (var8.length <= 1) {
                                    class282.field4109 = class282.field4109 + var7;
                                } else {
                                    for (int var9 = 0; ~var9 > ~var8.length; ++var9) {
                                        class282.field4109 = var8[var9];
                                        class398.method2436(126);
                                    }
                                }
                            }
                        } catch (Exception var10) {
                        }
                    }
                }
            } else if (var2 == 85 && ~class172.field2450 < -1) {
                class282.field4109 = class282.field4109.substring(0, class172.field2450 + -1) + class282.field4109.substring(class172.field2450);
                --class172.field2450;
            } else if (~var2 == -102 && class172.field2450 < class282.field4109.length()) {
                class282.field4109 = class282.field4109.substring(0, class172.field2450) + class282.field4109.substring(class172.field2450 - -1);
            } else if (var2 == 96 && ~class172.field2450 < -1) {
                --class172.field2450;
            } else if (var2 == 97 && ~class172.field2450 > ~class282.field4109.length()) {
                ++class172.field2450;
            } else if (~var2 != -103) {
                if (~var2 == -104) {
                    class172.field2450 = class282.field4109.length();
                } else if (var2 == 104 && ~class388.field5744 > ~class474.field6989.length) {
                    ++class388.field5744;
                    class38.method336(0);
                    class172.field2450 = class282.field4109.length();
                } else if (var2 == 105 && ~class388.field5744 < -1) {
                    --class388.field5744;
                    class38.method336(0);
                    class172.field2450 = class282.field4109.length();
                } else if (class176.method1235(-127, var3) || var3 == ':' || ~var3 == -45 || var3 == ' ' || ~var3 == -96 || var3 == '-' || ~var3 == -44 || ~var3 == -92 || ~var3 == -94) {
                    class282.field4109 = class282.field4109.substring(0, class172.field2450) + class386.field5678[var1].method704(2) + class282.field4109.substring(class172.field2450);
                    ++class172.field2450;
                }
            } else {
                class172.field2450 = 0;
            }
        }
        class484.field7122 = 0;
        if (arg0 >= 106) {
            class448.method2716(-11712);
        }
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V", line = 174)
    public class338() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IILiv;)V", line = 177)
    public final void method268(int arg0, int arg1, class65 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field4687 = arg2.method623((byte) -87);
                }
            } else {
                this.field4692 = arg2.method623((byte) -36);
            }
        } else {
            this.field4685 = arg2.method623((byte) -120);
        }
        if (arg0 != 4) {
            this.method268(-10, -44, (class65) null);
        }
        ++field4688;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(BI)[[I", line = 226)
    public final int[][] method272(byte arg0, int arg1) {
        if (arg0 <= 33) {
            this.method272((byte) 76, -49);
        }
        ++field4690;
        int[][] var3 = super.field1952.method3127((byte) 18, arg1);
        if (super.field1952.field7770) {
            int[][] var4 = this.method1036(3, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class467.field6889 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var13 == var14) {
                    var8[var11] = this.field4685 * var12 >> 12;
                    var9[var11] = this.field4692 * var13 >> 12;
                    var10[var11] = this.field4687 * var14 >> 12;
                } else {
                    var8[var11] = this.field4685;
                    var9[var11] = this.field4692;
                    var10[var11] = this.field4687;
                }
            }
        }
        return var3;
    }
}
