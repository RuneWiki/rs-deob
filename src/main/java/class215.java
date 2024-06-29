import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public abstract class class215 {

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field3299 = 0;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1537(int arg0) {
        if (arg0 > -110) {
            return;
        }
        field3303++;
        if (class322.field4964) {
            return;
        }
        if (class152.field2305) {
            class307.field4786 = (float) ((int) class307.field4786 + 47 & 0xFFFFFFF0);
        } else {
            class283.field4400 += (12.0F - class283.field4400) / 2.0F;
        }
        class322.field4964 = true;
        class16.field207 = true;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIBI)V", line = 32)
    public static final void method1538(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = -80 / ((39 - arg2) / 34);
        field3304++;
        class267.method1873(false, (byte) -32);
        class49.field676 = arg0;
        class141.field2176 = arg3;
        class165.method1251(arg1, (byte) 89);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILjd;Ljd;Z)Lnk;", line = 48)
    public static final class326 method1540(int arg0, int arg1, class95 arg2, class95 arg3, boolean arg4) {
        field3302++;
        if (arg4) {
            method1537(-101);
        }
        return class31.method233(arg1, 0, arg0, arg2) ? class218.method1555(arg3.method696(arg1, (byte) 123, arg0), 2) : null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)Z", line = 64)
    public static final boolean method1541(int arg0, int arg1) {
        class98.field1413 = arg0 + 1 & 0xFFFF;
        field3301++;
        if (arg1 <= 90) {
            field3299 = 19;
        }
        class112.field1693 = true;
        return true;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)Lw;", line = 98)
    public static final class129 method1543(int arg0, int arg1) {
        int var2 = -108 % ((27 - arg1) / 49);
        field3298++;
        class129 var3 = (class129) class100.field1448.method747((long) arg0, (byte) 101);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class314.field4872.method696(arg0, (byte) 113, 3);
        class129 var5 = new class129();
        if (var4 != null) {
            var5.method988(new class254(var4), -14999);
        }
        class100.field1448.method744(var5, -15692, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method1536(Component arg0, boolean arg1);

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method1539(byte arg0, Component arg1);

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)I")
    public abstract int method1542(int arg0);
}
