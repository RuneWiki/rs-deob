import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class63 {

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field736 = 0;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "Lnj;")
    public static class487 field738;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "Ldd;")
    public static class166 field735;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "[Lha;")
    public static class116[] field737;

    static {
        new class487("Your friends list is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
        field738 = new class487("Attack", "Angreifen", "Attaquer", "Atacar");
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II[F)[F", line = 4)
    public static final float[] method395(int arg0, int arg1, float[] arg2) {
        field732++;
        float[] var3 = new float[arg1];
        class473.method2884(arg2, 0, var3, 0, arg1);
        if (arg0 != -16777216) {
            field737 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZIILjava/lang/String;)Z", line = 18)
    public static final boolean method396(boolean arg0, int arg1, int arg2, String arg3) {
        field734++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg3.length();
        for (int var8 = arg1; var8 < var7; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg2) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if (var10 / arg2 != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        return var5;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V", line = 94)
    public static void method397(int arg0) {
        field738 = null;
        if (arg0 == 2) {
            field737 = null;
            field735 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIZIB)V", line = 111)
    public static final void method398(int arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5) {
        field733++;
        if (class526.field7777 == null) {
            class379.field5558.method1066((byte) 109, arg1, -16777216, arg2, arg0, arg4);
        } else if (class239.field3493.field3464 >= 0 && class239.field3493.field3464 < (class35.field399 * 128) && class239.field3493.field3463 >= 0 && (class382.field5586 * 128) > class239.field3493.field3463) {
            class614.field9000++;
            if (class239.field3493 != null && (class239.field3493.field3464 + 64 - class239.field3493.method514(0) * 64 >> 7) == class415.field5969 && (class239.field3493.field3463 - (class239.field3493.method514(0) - 1) * 64 >> 7) == class158.field2058) {
                class158.field2058 = -1;
                class415.field5969 = -1;
                class498.method3002(-56);
            }
            class352.method2151(-12858);
            if (!arg3) {
                class151.method886(82);
            }
            class361.method2214((byte) 24);
            class176.method1181(arg4, true, arg2, true, arg1, arg0);
            int var6 = class578.field8520;
            int var7 = class619.field9034;
            int var8 = class115.field1522;
            int var9 = class150.field1930;
            if (class287.field4232 == 1) {
                int var12 = (int) class578.field8523;
                if (var12 < class261.field3844 >> 8) {
                    var12 = class261.field3844 >> 8;
                }
                if (class41.field457[4] && class306.field4466[4] + 128 > var12) {
                    var12 = class306.field4466[4] + 128;
                }
                int var13 = (int) class591.field8752 + class6.field57 & 0x3FFF;
                class447.method2714(class300.field4403, var8, var12, 7516, class541.field8103, class226.method1477(class355.field5157, true, class239.field3493.field3464, class239.field3493.field3463) - 50, (var12 >> 3) * 3 + 600 << 0, var13);
            } else if (class287.field4232 == 4) {
                int var10 = (int) class578.field8523;
                if (class261.field3844 >> 8 > var10) {
                    var10 = class261.field3844 >> 8;
                }
                if (class41.field457[4] && var10 < class306.field4466[4] + 128) {
                    var10 = class306.field4466[4] + 128;
                }
                int var11 = (int) class591.field8752 & 0x3FFF;
                class447.method2714(class300.field4403, var8, var10, 7516, class541.field8103, class226.method1477(class355.field5157, true, class293.field4306, class392.field5713) - 50, 600 - -((var10 >> 3) * 3) << 0, var11);
            } else if (class287.field4232 == 5) {
                class591.method3445(var8, -1269786720);
            }
            int var14 = class358.field5200;
            int var15 = class111.field1412;
            int var16 = class367.field5319;
            if (arg5 < 94) {
                field735 = null;
            }
            int var17 = class151.field1935;
            int var18 = class543.field8120;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class41.field457[var19]) {
                    int var22 = (int) ((double) (-class188.field2858[var19]) + Math.random() * (double) (class188.field2858[var19] * 2 + 1) + Math.sin((double) class293.field4304[var19] / 100.0D * (double) class408.field5834[var19]) * (double) class306.field4466[var19]);
                    if (var19 == 4) {
                        class151.field1935 += var22;
                        if (class151.field1935 < 1024) {
                            class151.field1935 = 1024;
                        } else if (class151.field1935 > 3072) {
                            class151.field1935 = 3072;
                        }
                    }
                    if (var19 == 3) {
                        class543.field8120 = class543.field8120 + var22 & 0x3FFF;
                    }
                    if (var19 == 0) {
                        class358.field5200 += var22 << 0;
                    }
                    if (var19 == 2) {
                        class367.field5319 += var22 << 0;
                    }
                    if (var19 == 1) {
                        class111.field1412 += var22 << 0;
                    }
                }
            }
            if (class358.field5200 < 0) {
                class358.field5200 = 0;
            }
            if (class358.field5200 > ((class331.field4909 << 7) - 1)) {
                class358.field5200 = (class331.field4909 << 7) - 1;
            }
            if (class367.field5319 < 0) {
                class367.field5319 = 0;
            }
            if (((class366.field5271 << 7) - 1) < class367.field5319) {
                class367.field5319 = (class366.field5271 << 7) - 1;
            }
            class64.method403(-11075);
            class427.method2540(18818);
            class379.field5558.method1022(var6, var9, var6 + var7, var8 + var9);
            class379.field5558.method322();
            int var20 = class300.field4401;
            if (class477.field7267 == null) {
                class379.field5558.method321(var20);
            } else {
                class477.field7267.method187(var8, var7, var20, -42, class543.field8120, var9, class379.field5558, class151.field1935, var6, class492.field7432 << 3);
            }
            class171.method1090(-13787);
            class385.field5628.method608(class358.field5200, class111.field1412, class367.field5319, -class151.field1935 & 0x3FFF, -class543.field8120 & 0x3FFF, -class495.field7464 & 0x3FFF);
            class379.field5558.method999(class385.field5628);
            class379.field5558.method1016(var6 + (var7 / 2), var9 - -(var8 / 2), class380.field5565 << 1, class380.field5565 << 1);
            class581.method3393(var6 + (var7 / 2), class380.field5565 << 1, class380.field5565 << 1, var8 / 2 + var9, (byte) 106);
            class307.method1886(class367.field5319, class111.field1412, -class151.field1935 & 0x3FFF, class358.field5200, -class495.field7464 & 0x3FFF, -class543.field8120 & 0x3FFF, (byte) -123);
            byte var21 = class94.field1158.method2676(class239.field3499, 123) == 2 ? (byte) class614.field9000 : 1;
            class118.method728(class379.field5558, class576.field8505, class218.field3235, class385.field5628, class358.field5200, class111.field1412, class367.field5319, class22.field197, class109.field1384, class89.field1133, class200.field3004, class426.field6079, class190.field2886, class239.field3493.field3457 + 1, var21, class239.field3493.field3464 >> 7, class239.field3493.field3463 >> 7, !class94.field1158.field281);
            class171.method1090(-13787);
            if (class192.field2903 == 9) {
                class103.method599(var9, var8, -28992, var7, 256, 256, var6);
                class140.method848(var9, 256, var8, var7, (byte) -7, var6, 256);
                class538.method3160(var9, var7, var8, 256, var6, 256, (byte) -70);
                class157.method907(var7, var9, var6, var8, true);
            }
            class517.method3071();
            class111.field1412 = var15;
            class358.field5200 = var14;
            class367.field5319 = var16;
            class543.field8120 = var18;
            class151.field1935 = var17;
            if (class517.field7686 && class80.field919.method2186(66) == 0) {
                class517.field7686 = false;
            }
            if (class517.field7686) {
                class379.field5558.method1066((byte) 56, var9, -16777216, var6, var8, var7);
                class162.method946((byte) 67, class259.field3800, false, class288.field4237.method2953(3181, class77.field889));
            }
        } else {
            class379.field5558.method1066((byte) 55, arg1, -16777216, arg2, arg0, arg4);
        }
    }
}
