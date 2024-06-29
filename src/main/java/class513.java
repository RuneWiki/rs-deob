import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class513 extends class76 implements Runnable {

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "Z")
    private boolean field7565 = true;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
    public int field7570 = -1;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "Lfc;")
    private class170 field7568;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
    public static int field7566 = 0;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    public static int field7563 = -1;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "Z")
    public static boolean field7561 = false;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
    public static int field7567 = 328;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public static int field7557;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public static int field7559;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public static int field7560;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V")
    public final void method3049(byte arg0) {
        if (arg0 <= -102) {
            field7558++;
            this.field7565 = false;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3050(int arg0, int arg1, byte arg2) {
        if (arg2 >= -22) {
            method3051((byte) -118);
        }
        field7569++;
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)Z")
    public static final boolean method3051(byte arg0) {
        field7560++;
        try {
            if (arg0 < 118) {
                return true;
            }
            if (class372.field5534 == 2) {
                if (class250.field3687 == null) {
                    class250.field3687 = class197.method1393(class127.field1852, class445.field6586, class470.field6941);
                    if (class250.field3687 == null) {
                        return false;
                    }
                }
                if (class346.field4814 == null) {
                    class346.field4814 = new class258(class165.field2348, class25.field302);
                }
                if (class77.field1041.method2826(22050, class346.field4814, true, class73.field1005, class250.field3687)) {
                    class77.field1041.method2808((byte) 111);
                    class77.field1041.method2798(true, class498.field7403);
                    class77.field1041.method2820(class479.field7048, (byte) -94, class250.field3687);
                    class346.field4814 = null;
                    class127.field1852 = null;
                    class372.field5534 = 0;
                    class250.field3687 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class77.field1041.method2810(2);
            class346.field4814 = null;
            class127.field1852 = null;
            class372.field5534 = 0;
            class250.field3687 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!pg", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field7565) {
            this.field7568.method1206(this, 25152);
        }
        field7559++;
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(B)V")
    public final void method3052(byte arg0) {
        if (arg0 > -7) {
            field7561 = true;
        }
        (new Thread(this, "a")).start();
        field7557++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static final void method3053(boolean arg0, int arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        field7562++;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg0 ? 32768 : 0;
        if (arg1 != 32768) {
            field7566 = -11;
        }
        int var7 = var6 + (arg0 ? class95.field1280.field5640 : class95.field1280.field5636);
        for (int var8 = var6; var8 < var7; var8++) {
            class516 var11 = class95.field1280.method2335(var8, (byte) -99);
            if (var11.field7610 && var11.method3064(0).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class503.field7464 = null;
                    class402.field5967 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class402.field5967 = var5;
        class206.field2996 = 0;
        class503.field7464 = var4;
        String[] var9 = new String[class402.field5967];
        for (int var10 = 0; var10 < class402.field5967; var10++) {
            var9[var10] = class95.field1280.method2335(var4[var10], (byte) -99).method3064(0);
        }
        class283.method1807(0, var9, class503.field7464);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
    public static final void method3054(int arg0, int arg1, int arg2) {
        if (arg0 < 2) {
            method3053(true, -101, null);
        }
        field7564++;
        class215 var3 = class171.method1208(arg1, (byte) 119, 13);
        var3.method1465(-25852);
        var3.field3082 = arg2;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lfc;)V")
    public class513(class170 arg0) {
        this.field7568 = arg0;
    }
}
