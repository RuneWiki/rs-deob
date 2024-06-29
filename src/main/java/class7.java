import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class7 extends class99 {

    @OriginalMember(owner = "client!ba", name = "fb", descriptor = "Lpd;")
    public static class94 field133 = class28.method249(-124, "@gre@");

    @OriginalMember(owner = "client!ba", name = "eb", descriptor = "Lpd;")
    public static class94 field132 = class28.method249(-47, "Untersuchen");

    @OriginalMember(owner = "client!ba", name = "gb", descriptor = "Lpd;")
    private static class94 field134 = class28.method249(-57, "Drop");

    @OriginalMember(owner = "client!ba", name = "pb", descriptor = "Lpd;")
    public static class94 field143 = class28.method249(112, "@gr1@");

    @OriginalMember(owner = "client!ba", name = "jb", descriptor = "Lpd;")
    private static class94 field137 = class28.method249(64, "Bad session id)3");

    @OriginalMember(owner = "client!ba", name = "ob", descriptor = "Z")
    public static boolean field142 = false;

    @OriginalMember(owner = "client!ba", name = "hb", descriptor = "Lpd;")
    public static class94 field135 = class28.method249(37, "backhmid1");

    @OriginalMember(owner = "client!ba", name = "sb", descriptor = "Lpd;")
    public static class94 field146 = class28.method249(31, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");

    @OriginalMember(owner = "client!ba", name = "ib", descriptor = "Lpd;")
    private static class94 field136 = class28.method249(124, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!ba", name = "lb", descriptor = "Lpd;")
    public static class94 field139 = field137;

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "Lpd;")
    public static class94 field130 = field136;

    @OriginalMember(owner = "client!ba", name = "ub", descriptor = "Lpd;")
    public static class94 field148 = field134;

    @OriginalMember(owner = "client!ba", name = "xb", descriptor = "Lpd;")
    public static class94 field151 = class28.method249(38, "Spiel)2Fenster geladen)3");

    @OriginalMember(owner = "client!ba", name = "Bb", descriptor = "Lpd;")
    private static class94 field155 = class28.method249(79, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!ba", name = "yb", descriptor = "Lpd;")
    public static class94 field152 = field155;

    @OriginalMember(owner = "client!ba", name = "rb", descriptor = "I")
    public static int field145 = 256;

    @OriginalMember(owner = "client!ba", name = "Db", descriptor = "Lpd;")
    private static class94 field157 = class28.method249(-91, "Your ignore list is full)3 Max of 100 hit");

    @OriginalMember(owner = "client!ba", name = "Ab", descriptor = "Lpd;")
    public static class94 field154 = field157;

    @OriginalMember(owner = "client!ba", name = "mb", descriptor = "B")
    public byte field140;

    @OriginalMember(owner = "client!ba", name = "db", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!ba", name = "kb", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!ba", name = "nb", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!ba", name = "qb", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!ba", name = "tb", descriptor = "I")
    public int field147;

    @OriginalMember(owner = "client!ba", name = "wb", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!ba", name = "Cb", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!ba", name = "vb", descriptor = "Lmb;")
    public static class73 field149;

    @OriginalMember(owner = "client!ba", name = "zb", descriptor = "Lmb;")
    public class73 field153;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(B)V", line = 4)
    public static final void method38(byte arg0) {
        class89.field2301.method1013(-1);
        class17.field421.method1013(-1);
        field131++;
        if (arg0 != 113) {
            field157 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[BI)I", line = 16)
    public static final int method39(int arg0, byte[] arg1, int arg2) {
        field150++;
        int var3 = 45 % ((arg2 + 54) / 56);
        return class99.method749(0, arg1, arg0, -128);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;)I", line = 38)
    public static final int method40(byte arg0, KeyEvent arg1) {
        if (arg0 <= 45) {
            return -61;
        }
        field141++;
        int var2 = arg1.getKeyChar();
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(Z)V", line = 55)
    public static final void method41(boolean arg0) {
        field138++;
        if (class39.field1017 == null) {
            return;
        }
        if (arg0) {
            field133 = null;
        }
        if (class86.field2194 < 0) {
            if (class4.field93 > 0) {
                class4.field93--;
                if (class4.field93 == 0) {
                    if (class54.field1365 == null) {
                        class39.field1017.method390(256, 59);
                    } else {
                        class39.field1017.method390(class119.field2968, 59);
                        class86.field2194 = class119.field2968;
                        class39.field1017.method385(class86.field2193, -1, class54.field1365, class119.field2968);
                        class54.field1365 = null;
                    }
                    client.field490 = 0;
                }
            }
        } else if (class4.field93 > 0) {
            client.field490 += class103.field2594;
            class39.field1017.method388(class86.field2194, (byte) -37, client.field490);
            class4.field93--;
            if (class4.field93 == 0) {
                class39.field1017.method382(0);
                class86.field2194 = -1;
                class4.field93 = 20;
            }
        }
        class39.field1017.method383((byte) -34);
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V", line = 136)
    public static void method42(int arg0) {
        field137 = null;
        field155 = null;
        field135 = null;
        field143 = null;
        field133 = null;
        field152 = null;
        field132 = null;
        field151 = null;
        field139 = null;
        field149 = null;
        field148 = null;
        if (arg0 != -7660) {
            field157 = null;
        }
        field154 = null;
        field130 = null;
        field157 = null;
        field136 = null;
        field134 = null;
        field146 = null;
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V", line = 192)
    public static final void method43(int arg0) {
        Object var1 = class70.field1686;
        synchronized (class70.field1686) {
            if (arg0 != 1) {
                method41(true);
            }
            if (class80.field2050 != 0) {
                class80.field2050 = 1;
                try {
                    class70.field1686.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        field156++;
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V", line = 254)
    public static final void method44(int arg0) {
        for (int var1 = arg0; var1 < class66.field1613; var1++) {
            int var2 = class81.field2060[var1];
            class89 var3 = class85.field2138[var2];
            int var4 = class99.field2502.method943(-1025);
            if ((var4 & 0x1) != 0) {
                var4 += class99.field2502.method943(arg0 ^ 0xFFFFFBFF) << 8;
            }
            class62.method465(var4, var3, var2, (byte) -114);
        }
        field144++;
    }
}
