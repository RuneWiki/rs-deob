import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class112 {

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "F")
    public float field1698 = 1.0F;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "F")
    public float field1699 = 0.25F;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "F")
    public float field1702 = 1.0F;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
    public int field1712;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    public int field1715;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "F")
    public float field1704;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "F")
    public float field1708;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
    public int field1716;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public int field1703;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public int field1713;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "Lqs;")
    public class50 field1706;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "F")
    public float field1701;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public int field1707;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "Z")
    public static boolean field1700 = true;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public static int field1709 = -2;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    public static int field1711 = 0;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "[Lws;")
    public static class440[] field1717 = new class440[30];

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lmh;I)Z", line = 7)
    public final boolean method869(class112 arg0, int arg1) {
        field1710++;
        if (arg1 != 16) {
            this.field1716 = 93;
        }
        return this.field1716 == arg0.field1716 && this.field1708 == arg0.field1708 && this.field1701 == arg0.field1701 && this.field1704 == arg0.field1704 && this.field1699 == arg0.field1699 && this.field1698 == arg0.field1698 && this.field1702 == arg0.field1702 && this.field1715 == arg0.field1715 && this.field1712 == arg0.field1712 && this.field1706 == arg0.field1706;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V", line = 79)
    public class112() {
        this.field1712 = 0;
        this.field1715 = class358.field5475;
        this.field1704 = 1.2F;
        this.field1708 = 1.1523438F;
        this.field1716 = class457.field6689;
        this.field1703 = -50;
        this.field1713 = -50;
        this.field1706 = class303.field4521;
        this.field1701 = 0.69921875F;
        this.field1707 = -60;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lgk;)V", line = 95)
    public class112(class468 arg0) {
        int var2 = arg0.method2765(107);
        if (class454.field6661.method510(15479, class113.field1723) && class27.field395.method72() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field1716 = class457.field6689;
            } else {
                this.field1716 = arg0.method2722(false);
            }
            if ((var2 & 0x2) == 0) {
                this.field1708 = 1.1523438F;
            } else {
                this.field1708 = (float) arg0.method2727((byte) 43) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field1701 = 0.69921875F;
            } else {
                this.field1701 = (float) arg0.method2727((byte) 43) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field1704 = 1.2F;
            } else {
                this.field1704 = (float) arg0.method2727((byte) 43) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method2722(false);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method2727((byte) 43);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method2727((byte) 43);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method2727((byte) 43);
            }
            this.field1704 = 1.2F;
            this.field1701 = 0.69921875F;
            this.field1716 = class457.field6689;
            this.field1708 = 1.1523438F;
        }
        if ((var2 & 0x10) == 0) {
            this.field1707 = -60;
            this.field1713 = -50;
            this.field1703 = -50;
        } else {
            this.field1713 = arg0.method2745(-1);
            this.field1707 = arg0.method2745(-1);
            this.field1703 = arg0.method2745(-1);
        }
        if ((var2 & 0x20) == 0) {
            this.field1715 = class358.field5475;
        } else {
            this.field1715 = arg0.method2722(false);
        }
        if ((var2 & 0x40) == 0) {
            this.field1712 = 0;
        } else {
            this.field1712 = arg0.method2727((byte) 43);
        }
        if ((var2 & 0x80) == 0) {
            this.field1706 = class303.field4521;
        } else {
            int var3 = arg0.method2727((byte) 43);
            int var4 = arg0.method2727((byte) 43);
            int var5 = arg0.method2727((byte) 43);
            int var6 = arg0.method2727((byte) 43);
            int var7 = arg0.method2727((byte) 43);
            int var8 = arg0.method2727((byte) 43);
            this.field1706 = class357.method2143(var5, var3, var4, false, var7, var6, var8);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V", line = 35)
    public static void method870(byte arg0) {
        int var1 = 82 / ((arg0 - 41) / 34);
        field1717 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLgk;)V", line = 58)
    public final void method871(byte arg0, class468 arg1) {
        this.field1698 = (float) (arg1.method2765(64) * 8) / 255.0F;
        field1714++;
        this.field1699 = (float) (arg1.method2765(78) * 8) / 255.0F;
        this.field1702 = (float) (arg1.method2765(126) * 8) / 255.0F;
        if (arg0 != 59) {
            this.field1712 = -63;
        }
    }
}
