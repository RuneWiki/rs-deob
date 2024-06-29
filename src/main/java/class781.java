import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class781 implements class538 {
   @OriginalMember(
      owner = "client!nh",
      name = "h",
      descriptor = "Ltn;"
   )
   private class94 field11419;
   @OriginalMember(
      owner = "client!nh",
      name = "m",
      descriptor = "[Laja;"
   )
   private class99[] field11426;
   @OriginalMember(
      owner = "client!nh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11433 = new String[]{method5602(method5601("gD\"\u0016`")), method5602(method5601("gD\"\u0012`")), method5602(method5601("r\u0002\"~5")), method5602(method5601("gD\"l!gExn`")), method5602(method5601("gY`<")), method5602(method5601("aEx2){sh5.hY`$")), method5602(method5601("fXd5:eIz5$")), method5602(method5601("gMa5\u0017`Oc>;")), method5602(method5601("aIm4!jCb#\u0017y^m)-{")), method5602(method5601("dM|6$hK")), method5602(method5601("aEx=){G\u007f")), method5602(method5601("aEb$\u0017aIm4!jCb#")), method5602(method5601("zO~?$eNm\"")), method5602(method5601("aEb$\u0017dM|5,nI")), method5602(method5601("}Ea5:kM~\u000f,lJm%$}")), method5602(method5601("j^c#;")), method5602(method5601("dM|4'}_")), method5602(method5601("aEb$\u0017dM|=){Gi\";")), method5602(method5601("o@c?:zDm4'~_")), method5602(method5601("aIm4!jCb#\u0017yG")), method5602(method5601("gD\"\u0018`")), method5602(method5601("jCa )z_")), method5602(method5601("gD\"\u0013`")), method5602(method5601("gD\"\u0015`")), method5602(method5601("gD\"\u0019`")), method5602(method5601("xK")), method5602(method5601("cMz1fh[x~\u000bfA|?&lBx")), method5602(method5601("gD\"\u0017`")), method5602(method5601("gD\"\u0011`")), method5602(method5601("gD\"\u0014`"))};
   @OriginalMember(
      owner = "client!nh",
      name = "g",
      descriptor = "F"
   )
   public static float field11423;
   @OriginalMember(
      owner = "client!nh",
      name = "e",
      descriptor = "I"
   )
   public static int field11420;
   @OriginalMember(
      owner = "client!nh",
      name = "k",
      descriptor = "I"
   )
   public static int field11421;
   @OriginalMember(
      owner = "client!nh",
      name = "c",
      descriptor = "I"
   )
   public static int field11422;
   @OriginalMember(
      owner = "client!nh",
      name = "n",
      descriptor = "I"
   )
   public static int field11424;
   @OriginalMember(
      owner = "client!nh",
      name = "d",
      descriptor = "I"
   )
   public static int field11427;
   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "I"
   )
   public static int field11428;
   @OriginalMember(
      owner = "client!nh",
      name = "f",
      descriptor = "I"
   )
   public static int field11429;
   @OriginalMember(
      owner = "client!nh",
      name = "l",
      descriptor = "I"
   )
   public static int field11430;
   @OriginalMember(
      owner = "client!nh",
      name = "j",
      descriptor = "I"
   )
   public static int field11431;
   @OriginalMember(
      owner = "client!nh",
      name = "b",
      descriptor = "Lha;"
   )
   private class65 field11425;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!nh",
      name = "i",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field11432;
   @OriginalMember(
      owner = "client!nh",
      name = "o",
      descriptor = "Z"
   )
   private boolean field11418;

   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method3885(boolean arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         ++field11424;
         boolean var9 = true;
         class99[] var4 = this.field11426;
         if (arg1 != 22) {
            this.field11425 = null;
         }

         int var5 = 0;
         if (!var3 && var4.length <= var5) {
            this.field11418 = false;
         } else {
            do {
               class99 var6 = var4[var5];
               if (var6 != null) {
                  var6.method906(arg1 + 29538, !var9 ? this.field11418 : true);
               }

               ++var5;
            } while(var4.length > var5);

            this.field11418 = false;
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field11433[29] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method3888(byte arg0) {
      try {
         if (arg0 != 114) {
            field11423 = -1.6537977F;
         }

         ++field11429;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11433[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method5597(int arg0) {
      try {
         ++field11420;
         if (arg0 != 0) {
            field11423 = -0.02084571F;
         }

         if (!class81.field1014) {
            class138.field1784 += (-class138.field1784 + 12.0F) / 2.0F;
            class81.field1014 = true;
            class424.field5950 = true;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field11433[27] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method3887(byte arg0) {
      try {
         if (arg0 < 61) {
            this.method3886(42, 36L);
         }

         ++field11430;
         return this.field11419.field1251;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11433[23] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method3889(int arg0) {
      boolean var2 = client.field4273;

      try {
         ++field11422;
         if (arg0 != 28664) {
            this.field11425 = null;
         }

         int var3 = 0;
         class99[] var4 = this.field11426;
         int var5 = 0;
         class99 var6;
         if (var2) {
            var6 = var4[var5];
            if (var6 != null) {
               if (var6.method907(true)) {
                  ++var3;
                  ++var5;
               } else {
                  ++var5;
               }
            } else {
               ++var3;
               ++var5;
            }
         }

         while(~var5 > ~var4.length) {
            var6 = var4[var5];
            if (var6 != null) {
               if (var6.method907(true)) {
                  ++var3;
                  ++var5;
               } else {
                  ++var5;
               }
            } else {
               ++var3;
               ++var5;
            }
         }

         return var3 * 100 / this.field11426.length;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field11433[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "(IJ)Z"
   )
   public final boolean method3886(int arg0, long arg1) {
      try {
         ++field11421;
         if (arg0 < 113) {
            field11423 = 0.11078939F;
         }

         return (long)this.field11419.field1244 + arg1 <= class792.method5708(-25005);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field11433[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "(Lqh;I)V"
   )
   public static final void method5598(class74 arg0, int arg1) {
      try {
         ++field11428;
         class225.field2818 = arg0.method740(-1, field11433[10]);
         class472.field6544 = arg0.method740(-1, field11433[5]);
         class47.field550 = arg0.method740(-1, field11433[14]);
         class307.field4087 = arg0.method740(-1, field11433[19]);
         class313.field4170 = arg0.method740(-1, field11433[8]);
         class706.field10253 = arg0.method740(-1, field11433[11]);
         class322.field4297 = arg0.method740(-1, field11433[17]);
         class363.field5141 = arg0.method740(-1, field11433[9]);
         class135.field1756 = arg0.method740(-1, field11433[15]);
         class144.field1903 = arg0.method740(-1, field11433[16]);
         class794.field11602 = arg0.method740(-1, field11433[12]);
         class575.field7910 = arg0.method740(-1, field11433[7]);
         class111.field1401 = arg0.method740(-1, field11433[18]);
         class522.field7152 = arg0.method740(-1, field11433[21]);
         class182.field2247 = arg0.method740(-1, field11433[6]);
         int var2 = -22 % ((arg1 - -81) / 36);
         class121.field1517 = arg0.method740(-1, field11433[13]);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field11433[20] + (arg0 != null ? field11433[2] : field11433[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "<init>",
      descriptor = "(Ltn;Lwja;)V"
   )
   public class781(class94 param1, class281 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "(Ljava/awt/Component;ZI)Lgq;"
   )
   public static final class544 method5599(Component arg0, boolean arg1, int arg2) {
      try {
         ++field11427;

         try {
            if (arg2 != 0) {
               return null;
            } else {
               Constructor var3 = Class.forName(field11433[25]).getDeclaredConstructor(field11432 != null ? field11432 : (field11432 = method5600(field11433[26])), Boolean.TYPE);
               return (class544)var3.newInstance(arg0, new Boolean(arg1));
            }
         } catch (Throwable var5) {
            return new class208(arg0, arg1);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field11433[24] + (arg0 != null ? field11433[2] : field11433[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method3890(int arg0) {
      boolean var2 = client.field4273;

      try {
         if (class338.field4832 != this.field11425) {
            this.field11425 = class338.field4832;
            this.field11418 = true;
         }

         ++field11431;
         this.field11425.method589(0);
         class99[] var3 = this.field11426;
         int var4 = 0;
         class99 var5;
         if (arg0 != 11541) {
            this.method3885(true, (byte)-67);
            if (var2) {
               var5 = var3[var4];
               if (var5 != null) {
                  var5.method905(-15238);
               }

               ++var4;
            }
         }

         while(var3.length > var4) {
            var5 = var3[var4];
            if (var5 != null) {
               var5.method905(-15238);
            }

            ++var4;
         }

      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field11433[28] + arg0 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method5600(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5601(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 72);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5602(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 9;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 72;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
