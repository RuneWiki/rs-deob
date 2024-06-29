import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class606 extends class513 {

    @OriginalMember(owner = "client!v", name = "C", descriptor = "Ljava/lang/String;")
    public String field8462;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "Loaa;")
    public class305 field8460;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "Ljda;")
    public static class240 field8459 = new class240();

    @OriginalMember(owner = "client!v", name = "E", descriptor = "[Lkj;")
    public static class593[] field8464 = new class593[2048];

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    public static int field8455;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    public static int field8456;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    public int field8457;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    public static int field8458;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    public static int field8461;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public static int field8463;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    public static int field8465;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "I")
    public static int field8466;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 3)
    public static void method3439(int arg0) {
        field8464 = null;
        if (arg0 == -7271) {
            field8459 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lod;B)Z", line = 21)
    public final boolean method3440(class534 arg0, byte arg1) {
        field8461++;
        arg0.method2942(false);
        boolean var3 = true;
        if (arg1 >= -43) {
            field8463 = -71;
        }
        for (class534 var4 = (class534) this.field8460.method1951(-723780560); var4 != null; var4 = (class534) this.field8460.method1946(-6974)) {
            if (class513.method2940(arg0.field7229, -108, var4.field7229)) {
                class485.method2771(arg0, -33, var4);
                this.field8457++;
                if (var3) {
                    return false;
                }
                return true;
            }
            var3 = false;
        }
        this.field8460.method1953((byte) 83, arg0);
        this.field8457++;
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZII)I", line = 55)
    public static final int method3441(int arg0, boolean arg1, int arg2, int arg3) {
        field8456++;
        class539 var4 = class210.method1479(arg1, -109, arg2);
        if (var4 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field7323.length; var6++) {
                if (var4.field7320[var6] == arg0) {
                    var5 += var4.field7323[var6];
                }
            }
            if (arg3 != 32528) {
                method3444(-35, true);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILod;)Z", line = 87)
    public final boolean method3442(int arg0, class534 arg1) {
        field8466++;
        int var3 = this.method3443((byte) -26);
        arg1.method2942(false);
        this.field8457--;
        if (~this.field8457 != arg0) {
            return var3 != this.method3443((byte) -26);
        }
        this.method1207(109);
        this.method2942(false);
        class430.field5861--;
        class668.field9294.method270(this, arg1.field7235, arg0 ^ 0x7F);
        return false;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 115)
    public class606(String arg0) {
        this.field8462 = arg0;
        this.field8460 = new class305();
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)I", line = 124)
    public final int method3443(byte arg0) {
        field8458++;
        if (this.field8460.field4189.field7006 == this.field8460.field4189) {
            if (arg0 != -26) {
                field8463 = -17;
            }
            return -1;
        } else {
            return ((class534) this.field8460.field4189.field7006).field7229;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZ)I", line = 144)
    public static final int method3444(int arg0, boolean arg1) {
        if (arg1) {
            method3439(-61);
        }
        field8465++;
        return arg0 >>> 8;
    }
}
