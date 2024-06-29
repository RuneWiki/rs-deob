import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class104 extends class79 {

    @OriginalMember(owner = "client!i", name = "K", descriptor = "I")
    public int field1601 = 0;

    @OriginalMember(owner = "client!i", name = "P", descriptor = "[I")
    public int[] field1606 = new int[5];

    @OriginalMember(owner = "client!i", name = "T", descriptor = "[Lnl;")
    public class196[] field1610 = new class196[5];

    @OriginalMember(owner = "client!i", name = "B", descriptor = "I")
    public int field1592;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "I")
    public int field1609;

    @OriginalMember(owner = "client!i", name = "X", descriptor = "I")
    public int field1614;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "I")
    public int field1608;

    @OriginalMember(owner = "client!i", name = "V", descriptor = "Z")
    public static boolean field1612 = false;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!i", name = "y", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!i", name = "A", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!i", name = "E", descriptor = "I")
    public int field1595;

    @OriginalMember(owner = "client!i", name = "F", descriptor = "I")
    public int field1596;

    @OriginalMember(owner = "client!i", name = "G", descriptor = "I")
    public int field1597;

    @OriginalMember(owner = "client!i", name = "I", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!i", name = "J", descriptor = "I")
    public int field1600;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "I")
    public int field1604;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "I")
    public int field1607;

    @OriginalMember(owner = "client!i", name = "M", descriptor = "Li;")
    public class104 field1603;

    @OriginalMember(owner = "client!i", name = "z", descriptor = "Led;")
    public class106 field1590;

    @OriginalMember(owner = "client!i", name = "C", descriptor = "Lod;")
    public class146 field1593;

    @OriginalMember(owner = "client!i", name = "H", descriptor = "Lk;")
    public class199 field1598;

    @OriginalMember(owner = "client!i", name = "Y", descriptor = "Lva;")
    public static class36 field1615;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "Lhl;")
    public class37 field1605;

    @OriginalMember(owner = "client!i", name = "D", descriptor = "Lkf;")
    public class41 field1594;

    @OriginalMember(owner = "client!i", name = "L", descriptor = "Leg;")
    public class69 field1602;

    @OriginalMember(owner = "client!i", name = "U", descriptor = "Z")
    public boolean field1611;

    @OriginalMember(owner = "client!i", name = "W", descriptor = "Z")
    public boolean field1613;

    @OriginalMember(owner = "client!i", name = "Z", descriptor = "Z")
    public boolean field1616;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(B)V", line = 21)
    public static final void method685(byte arg0) {
        for (int var1 = 0; var1 < class292.field4868; var1++) {
            class252 var2 = class132.method873(var1, false);
            if (var2 != null && var2.field4055 == 0) {
                class277.field4548[var1] = 0;
                class106.field1641[var1] = 0;
            }
        }
        field1587++;
        class23.field356 = new class212(16);
        if (arg0 <= 88) {
            field1612 = false;
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(III)V", line = 49)
    public class104(int arg0, int arg1, int arg2) {
        this.field1609 = this.field1592 = arg0;
        this.field1614 = arg1;
        this.field1608 = arg2;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)V", line = 71)
    public static final void method686(byte arg0, int arg1) {
        if (arg0 >= -126) {
            field1612 = false;
        }
        class5.field132 = 1000 / arg1;
        field1589++;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIII)V", line = 93)
    public static final void method687(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 0) {
            method685((byte) -112);
        }
        field1586++;
        if (arg0 >= class79.field1226 && arg0 <= class59.field957) {
            int var5 = class197.method1264(-98, arg2, class108.field1650, class236.field3800);
            int var6 = class197.method1264(arg1 ^ 0xFFFFFF95, arg3, class108.field1650, class236.field3800);
            class209.method1311(arg0, var6, arg4, arg1 + 116, var5);
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V", line = 143)
    public static void method688(int arg0) {
        if (arg0 != 0) {
            field1599 = 3;
        }
        field1615 = null;
    }
}
