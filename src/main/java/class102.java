import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class102 extends class439 {

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    public int field1626;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "I")
    public int field1634;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "Ljava/lang/String;")
    public static String field1633;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method778(boolean arg0) {
        field1631++;
        class407.field5984.method2223(120);
        class224.field3259.method270((byte) -115);
        if (!arg0) {
            method785((byte) -24);
        }
        class413.field6075.method1853(-122);
        class246.field3567.method613((byte) 123);
        class500.field7358.method1606((byte) 57);
        class8.field111.method3078(-119);
        class311.field4455.method1236(-1);
        class450.field6582.method1473(-1);
        class369.field5528.method723(18870);
        class85.field1409.method729(-44);
        class4.field64.method1201((byte) -40);
        class173.field2651.method1765((byte) -49);
        class495.field7209.method1836((byte) 99);
        class275.field3992.method1663((byte) -116);
        class219.field3164.method2568(-1997);
        class233.field3389.method1205(26154);
        class25.field443.method302(72);
        class17.field267.method1281(31);
        class230.field3355.method2759((byte) 23);
        class418.field6177.method3032(!arg0);
        class417.method2566((byte) 81);
        class482.method2884(125);
        class526.method3107(false);
        class94.method754(6);
        class439.field6400.method2350((byte) 112);
        class91.field1511.method2350((byte) 112);
        class326.field5032.method2350((byte) 112);
        class148.field2208.method2350((byte) 112);
        class150.field2298.method2350((byte) 112);
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(B)I", line = 45)
    public final int method779(byte arg0) {
        field1637++;
        return arg0 == 122 ? class294.method1817((byte) 126, this.field1626) : 75;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)Z", line = 58)
    public final boolean method780(int arg0) {
        field1632++;
        if (arg0 != -1) {
            this.field1626 = 89;
        }
        return ((this.field1626 & 0x786CAE) >> 22) != 0;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(B)Z", line = 69)
    public final boolean method781(byte arg0) {
        field1629++;
        if (arg0 <= 94) {
            this.field1634 = -79;
        }
        return (this.field1626 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z", line = 83)
    public final boolean method782(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method781((byte) 97);
        }
        field1630++;
        return (this.field1626 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I[Ljava/lang/String;IB)Ljava/lang/String;", line = 94)
    public static final String method783(int arg0, String[] arg1, int arg2, byte arg3) {
        field1636++;
        if (arg0 == 0) {
            return "";
        } else if (arg0 == 1) {
            String var4 = arg1[arg2];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg2;
            int var6 = 0;
            for (int var7 = arg2; var7 < var5; var7++) {
                String var11 = arg1[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            if (arg3 != 78) {
                field1633 = null;
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg2; var9 < var5; var9++) {
                String var10 = arg1[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(B)Z", line = 155)
    public final boolean method784(byte arg0) {
        field1628++;
        if (arg0 >= -81) {
            this.field1626 = 13;
        }
        return (this.field1626 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(B)V", line = 172)
    public static void method785(byte arg0) {
        int var1 = 16 % ((63 - arg0) / 55);
        field1633 = null;
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "(B)I", line = 181)
    public final int method786(byte arg0) {
        if (arg0 != -3) {
            this.method781((byte) -76);
        }
        field1635++;
        return (this.field1626 & 0x1E0F7D) >> 18;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(II)V", line = 192)
    public class102(int arg0, int arg1) {
        this.field1626 = arg0;
        this.field1634 = arg1;
    }
}
