import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class421 implements Runnable {

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "[Lgw;")
    public volatile class182[] field6030 = new class182[2];

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "Z")
    public volatile boolean field6031 = false;

    @OriginalMember(owner = "client!jba", name = "g", descriptor = "Z")
    public volatile boolean field6036 = false;

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "I")
    public static int field6033 = -1;

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!jba", name = "f", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "Lqn;")
    public class70 field6034;

    @OriginalMember(owner = "client!jba", name = "run", descriptor = "()V", line = 11)
    public final void run() {
        field6035++;
        this.field6036 = true;
        try {
            while (!this.field6031) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class182 var2 = this.field6030[var1];
                    if (var2 != null) {
                        var2.method1262((byte) 109);
                    }
                }
                class438.method2636(true, 10L);
                class189.method1311(null, this.field6034, 28569);
            }
        } catch (Exception var9) {
            class664.method3681((byte) -77, null, var9);
        } finally {
            Object var6 = null;
            this.field6036 = false;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lgaa;I)V", line = 45)
    public static final void method2594(class315 arg0, int arg1) {
        arg0.method2354(class74.field1100.method2112(255), (byte) 63);
        field6032++;
        arg0.method2354(class651.field9035.method2112(255), (byte) 75);
        arg0.method2354(class637.field8871.method2112(255), (byte) 77);
        arg0.method2354(class415.field5964.method2112(255), (byte) 127);
        arg0.method2354(class11.field175.method2112(255), (byte) 107);
        arg0.method2354(class587.field7828.method2112(255), (byte) 82);
        arg0.method2354(class177.field2367.method2112(255), (byte) 66);
        arg0.method2354(class237.field3203.method2112(255), (byte) 112);
        arg0.method2354(class643.field8927.method2112(255), (byte) 104);
        arg0.method2354(class176.field2352.method2112(255), (byte) 94);
        arg0.method2354(class586.field7805.method2112(255), (byte) 60);
        arg0.method2354(class183.field2444.method2112(255), (byte) 106);
        arg0.method2354(class383.field5606.method2112(255), (byte) 95);
        arg0.method2354(class781.field10716.method2112(255), (byte) 76);
        arg0.method2354(class396.field5819.method2112(255), (byte) 57);
        arg0.method2354(class344.field5072.method2112(255), (byte) 90);
        arg0.method2354(class281.field4150.method2112(255), (byte) 111);
        if (arg1 >= -17) {
            method2594(null, -59);
        }
        arg0.method2354(class473.field6529.method2112(255), (byte) 120);
        arg0.method2354(class108.field1492.method2112(255), (byte) 65);
        arg0.method2354(class262.field3891.method2112(255), (byte) 118);
        arg0.method2354(class33.field530.method2112(255), (byte) 101);
        arg0.method2354(class598.field8141.method2112(255), (byte) 107);
        arg0.method2354(class554.field7478.method2112(255), (byte) 84);
        arg0.method2354(class466.field6466.method2112(255), (byte) 64);
        arg0.method2354(class461.field6394.method2112(255), (byte) 77);
        arg0.method2354(class583.field7790.method2112(255), (byte) 108);
        arg0.method2354(class16.field241.method2112(255), (byte) 124);
        arg0.method2354(class219.field2911.method2112(255), (byte) 120);
        arg0.method2354(class162.field2210.method2112(255), (byte) 77);
        arg0.method2354(class138.field2009.method2112(255), (byte) 101);
        arg0.method2354(class437.field6160.method2112(255), (byte) 91);
        arg0.method2354(class482.field6667.method2112(255), (byte) 109);
        arg0.method2354(class768.method4255(127), (byte) 95);
        arg0.method2354(class209.method1393(64), (byte) 111);
        arg0.method2354(class134.field1966.method2112(255), (byte) 73);
    }
}
