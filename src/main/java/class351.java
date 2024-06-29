import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class351 {

    @OriginalMember(owner = "client!mq", name = "h", descriptor = "Z")
    public boolean field5151 = false;

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "Lnj;")
    private class162 field5149 = new class162(64);

    @OriginalMember(owner = "client!mq", name = "s", descriptor = "Lnj;")
    public class162 field5162 = new class162(500);

    @OriginalMember(owner = "client!mq", name = "t", descriptor = "Lnj;")
    public class162 field5163 = new class162(30);

    @OriginalMember(owner = "client!mq", name = "u", descriptor = "Lnj;")
    public class162 field5164 = new class162(50);

    @OriginalMember(owner = "client!mq", name = "r", descriptor = "Lmg;")
    public class101 field5161;

    @OriginalMember(owner = "client!mq", name = "n", descriptor = "Z")
    public boolean field5157;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "Lmg;")
    private class101 field5145;

    @OriginalMember(owner = "client!mq", name = "i", descriptor = "Lqp;")
    public static class466 field5152 = new class466("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!mq", name = "l", descriptor = "Lqp;")
    public static class466 field5155 = new class466("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!mq", name = "p", descriptor = "Lqp;")
    public static class466 field5159 = new class466("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!mq", name = "j", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!mq", name = "k", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!mq", name = "m", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!mq", name = "v", descriptor = "I")
    public int field5165;

    @OriginalMember(owner = "client!mq", name = "o", descriptor = "Lfi;")
    public static class389 field5158;

    @OriginalMember(owner = "client!mq", name = "q", descriptor = "[[I")
    public static int[][] field5160;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)V", line = 6)
    public final void method2102(int arg0, int arg1) {
        class162 var3 = this.field5149;
        synchronized (this.field5149) {
            if (arg1 > -65) {
                this.method2104(100, 3);
            }
            this.field5149.method1065((byte) -95, arg0);
        }
        field5147++;
        class162 var4 = this.field5162;
        synchronized (this.field5162) {
            this.field5162.method1065((byte) -95, arg0);
        }
        class162 var5 = this.field5163;
        synchronized (this.field5163) {
            this.field5163.method1065((byte) -95, arg0);
        }
        class162 var6 = this.field5164;
        synchronized (this.field5164) {
            this.field5164.method1065((byte) -95, arg0);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IZ)Ljo;", line = 30)
    public final class220 method2103(int arg0, boolean arg1) {
        field5153++;
        class162 var3 = this.field5149;
        class220 var4;
        synchronized (this.field5149) {
            var4 = (class220) this.field5149.method1073((long) arg0, false);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5145.method727(class409.method2448(arg1, arg0), class340.method2021((byte) -84, arg0), 81);
        class220 var6 = new class220();
        var6.field3110 = arg0;
        var6.field3111 = this;
        if (var5 != null) {
            var6.method1360(new class391(var5), 127007);
        }
        var6.method1375((byte) 77);
        if (var6.field3122) {
            var6.field3147 = false;
            var6.field3146 = 0;
        }
        if (!this.field5157 && var6.field3115) {
            var6.field3094 = null;
            var6.field3132 = null;
        }
        class162 var7 = this.field5149;
        synchronized (this.field5149) {
            this.field5149.method1072((long) arg0, var6, false);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(II)V", line = 71)
    public final void method2104(int arg0, int arg1) {
        field5144++;
        this.field5149 = new class162(arg1);
        if (arg0 != 50) {
            method2108(-122);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V", line = 82)
    public final void method2105(int arg0) {
        class162 var2 = this.field5149;
        synchronized (this.field5149) {
            this.field5149.method1068(0);
        }
        if (arg0 != 64) {
            this.method2102(111, 51);
        }
        field5154++;
        class162 var3 = this.field5162;
        synchronized (this.field5162) {
            this.field5162.method1068(arg0 - 64);
        }
        class162 var4 = this.field5163;
        synchronized (this.field5163) {
            this.field5163.method1068(0);
        }
        class162 var5 = this.field5164;
        synchronized (this.field5164) {
            this.field5164.method1068(0);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IB)V", line = 104)
    public final void method2106(int arg0, byte arg1) {
        field5156++;
        this.field5165 = arg0;
        class162 var3 = this.field5162;
        synchronized (this.field5162) {
            this.field5162.method1068(0);
        }
        class162 var4 = this.field5163;
        synchronized (this.field5163) {
            this.field5163.method1068(0);
        }
        int var5 = 49 / ((arg1 - 38) / 60);
        class162 var6 = this.field5164;
        synchronized (this.field5164) {
            this.field5164.method1068(0);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V", line = 126)
    public final void method2107(byte arg0) {
        class162 var2 = this.field5149;
        synchronized (this.field5149) {
            this.field5149.method1066(4080);
        }
        field5146++;
        class162 var3 = this.field5162;
        synchronized (this.field5162) {
            this.field5162.method1066(4080);
        }
        class162 var4 = this.field5163;
        synchronized (this.field5163) {
            if (arg0 != -65) {
                this.method2103(78, true);
            }
            this.field5163.method1066(4080);
        }
        class162 var5 = this.field5164;
        synchronized (this.field5164) {
            this.field5164.method1066(arg0 ^ 0xFFFFF04F);
        }
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)V", line = 148)
    public static void method2108(int arg0) {
        field5152 = null;
        field5155 = null;
        if (arg0 != 27701) {
            method2108(52);
        }
        field5159 = null;
        field5158 = null;
        field5160 = null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZI)V", line = 163)
    public final void method2109(boolean arg0, int arg1) {
        field5150++;
        if (this.field5157 != arg0) {
            this.field5157 = arg0;
            if (arg1 == 0) {
                this.method2105(arg1 ^ 0x40);
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZB)V", line = 179)
    public final void method2110(boolean arg0, byte arg1) {
        field5148++;
        if (this.field5151 != arg0) {
            int var3 = -107 / ((arg1 + 63) / 47);
            this.field5151 = arg0;
            this.method2105(64);
        }
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lal;IZLmg;Lmg;)V", line = 231)
    public class351(class66 arg0, int arg1, boolean arg2, class101 arg3, class101 arg4) {
        this.field5161 = arg4;
        this.field5157 = arg2;
        this.field5145 = arg3;
        if (this.field5145 != null) {
            int var6 = this.field5145.method746(87) - 1;
            this.field5145.method753(var6, -70);
        }
    }
}
