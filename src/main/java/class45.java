import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class45 {

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field542 = 2;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Llg;")
    public static class237 field541 = new class237(64);

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III)V")
    public static final void method264(int arg0, int arg1, int arg2) {
        field546++;
        class20 var3 = class369.method2351((byte) 110, 16, arg1);
        var3.method146(arg2 + 22324);
        var3.field252 = arg0;
        if (arg2 != -22243) {
            field541 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public static final void method265(byte arg0) {
        if (arg0 != 6) {
            method265((byte) -30);
        }
        class237 var1 = class222.field3111;
        synchronized (class222.field3111) {
            class222.field3111.method1626((byte) 106);
        }
        field544++;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(B)V")
    public static void method266(byte arg0) {
        if (arg0 != -120) {
            field542 = -68;
        }
        field541 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method267(String arg0, byte arg1) {
        field543++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 >= -34) {
            field541 = null;
        }
        for (int var2 = 0; var2 < class97.field1170; var2++) {
            if (arg0.equalsIgnoreCase(class99.field1213[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class409.field5895[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
    public static final void method268() {
        if (class276.field3922 != null) {
            for (int var0 = 0; var0 < class276.field3922.length; var0++) {
                for (int var1 = 0; var1 < class415.field5953; var1++) {
                    for (int var2 = 0; var2 < class299.field4190; var2++) {
                        if (class276.field3922[var0][var1][var2] != null) {
                            class276.field3922[var0][var1][var2].method1306((byte) 78);
                        }
                        class276.field3922[var0][var1][var2] = null;
                    }
                }
            }
        }
        class276.field3922 = null;
        class98.field1191 = null;
        if (class370.field5218 != null) {
            for (int var3 = 0; var3 < class370.field5218.length; var3++) {
                for (int var4 = 0; var4 < class415.field5953; var4++) {
                    for (int var5 = 0; var5 < class299.field4190; var5++) {
                        if (class370.field5218[var3][var4][var5] != null) {
                            class370.field5218[var3][var4][var5].method1306((byte) 89);
                        }
                        class370.field5218[var3][var4][var5] = null;
                    }
                }
            }
        }
        class370.field5218 = null;
        class399.field5693 = null;
        class250.field3570 = null;
        class161.field2122 = null;
        class422.field6022 = 0;
        if (class374.field5252 != null) {
            for (int var6 = 0; var6 < class422.field6022; var6++) {
                class374.field5252[var6] = null;
            }
        }
        if (class97.field1168 != null) {
            for (int var7 = 0; var7 < class244.field3466; var7++) {
                class97.field1168[var7] = null;
            }
            class244.field3466 = 0;
        }
        if (class266.field3800 != null) {
            for (int var8 = 0; var8 < class75.field886; var8++) {
                class266.field3800[var8] = null;
            }
            for (int var9 = 0; var9 < class167.field2334; var9++) {
                for (int var10 = 0; var10 < class415.field5953; var10++) {
                    for (int var11 = 0; var11 < class299.field4190; var11++) {
                        class229.field3232[var9][var10][var11] = 0;
                    }
                }
            }
            class75.field886 = 0;
        }
        class389.field5494 = null;
        class274.method1807((byte) 27);
        class134.field1615.method2508(95);
        class144.field1782 = null;
        class87.field992 = null;
        class382.field5377 = null;
        class36.field422 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static final void method269(int arg0) {
        class293.field4090++;
        field545++;
        class62.field718.method2143(arg0, -2);
        class62.field718.method1605(class336.field4771, false);
    }
}
