import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class696 {
   @OriginalMember(
      owner = "client!ab",
      name = "l",
      descriptor = "Lgw;"
   )
   private class179 field10199 = new class179(64);
   @OriginalMember(
      owner = "client!ab",
      name = "m",
      descriptor = "Lgw;"
   )
   public class179 field10209 = new class179(64);
   @OriginalMember(
      owner = "client!ab",
      name = "o",
      descriptor = "Lhw;"
   )
   private class141 field10204;
   @OriginalMember(
      owner = "client!ab",
      name = "r",
      descriptor = "Lhw;"
   )
   public class141 field10193;
   @OriginalMember(
      owner = "client!ab",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10210 = new String[]{method5067(method5066("Z\u0001@\r")), method5067(method5066("U\u0016\u0002(`")), method5067(method5066("OZ\u0002O5")), method5067(method5066("|\u001dH\u0005-ZYY\u0012-")), method5067(method5066("U\u0016\u0002#`")), method5067(method5066("U\u0016\u0002'`")), method5067(method5066("U\u0016\u0002]!Z\u001dX_`")), method5067(method5066("U\u0016\u0002*`")), method5067(method5066("U\u0016\u0002%`")), method5067(method5066("U\u0016\u0002)`")), method5067(method5066("U\u0016\u0002\"`")), method5067(method5066("U\u0016\u0002&`")), method5067(method5066("U\u0016\u0002 `")), method5067(method5066("U\u0016\u0002$`")), method5067(method5066("U\u0016\u0002+`"))};
   @OriginalMember(
      owner = "client!ab",
      name = "d",
      descriptor = "Lgh;"
   )
   public static class572 field10196 = new class572(109, -2);
   @OriginalMember(
      owner = "client!ab",
      name = "j",
      descriptor = "I"
   )
   public static int field10192;
   @OriginalMember(
      owner = "client!ab",
      name = "i",
      descriptor = "I"
   )
   public static int field10194;
   @OriginalMember(
      owner = "client!ab",
      name = "q",
      descriptor = "I"
   )
   public static int field10197;
   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "I"
   )
   public static int field10198;
   @OriginalMember(
      owner = "client!ab",
      name = "g",
      descriptor = "I"
   )
   public static int field10201;
   @OriginalMember(
      owner = "client!ab",
      name = "b",
      descriptor = "I"
   )
   public static int field10202;
   @OriginalMember(
      owner = "client!ab",
      name = "e",
      descriptor = "I"
   )
   public static int field10203;
   @OriginalMember(
      owner = "client!ab",
      name = "h",
      descriptor = "I"
   )
   public static int field10205;
   @OriginalMember(
      owner = "client!ab",
      name = "k",
      descriptor = "I"
   )
   public static int field10206;
   @OriginalMember(
      owner = "client!ab",
      name = "n",
      descriptor = "I"
   )
   public static int field10207;
   @OriginalMember(
      owner = "client!ab",
      name = "f",
      descriptor = "I"
   )
   public static int field10208;
   @OriginalMember(
      owner = "client!ab",
      name = "c",
      descriptor = "Lhw;"
   )
   public static class141 field10200;
   @OriginalMember(
      owner = "client!ab",
      name = "p",
      descriptor = "[[Z"
   )
   public static boolean[][] field10195;

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(IB)I"
   )
   public static final int method5055(int arg0, byte arg1) {
      try {
         if (arg1 != -42) {
            method5059((byte)28, -47, (class303[])null);
         }

         ++field10197;
         return arg0 >>> 8;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10210[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(II)Lhda;"
   )
   public final class780 method5056(int arg0, int arg1) {
      try {
         ++field10198;
         class179 var3 = this.field10199;
         class780 var4;
         synchronized(this.field10199) {
            var4 = (class780)this.field10199.method1584((long)arg0, 1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class141 var5 = this.field10204;
            byte[] var6;
            synchronized(this.field10204) {
               var6 = this.field10204.method1347((byte)127, 34, arg0);
            }

            class780 var7 = new class780();
            var7.field11436 = this;
            if (var6 != null) {
               var7.method5642(new class473(var6), (byte)-4);
            }

            class179 var8 = this.field10199;
            synchronized(this.field10199) {
               this.field10199.method1581((long)arg0, 0, var7);
               if (arg1 <= 45) {
                  this.field10199 = null;
               }

               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field10210[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method5057(int arg0, byte arg1) {
      try {
         ++field10207;
         class179 var3 = this.field10199;
         synchronized(this.field10199) {
            this.field10199.method1579(91, arg0);
         }

         class179 var4 = this.field10209;
         synchronized(this.field10209) {
            int var5 = -16 / ((arg1 - 32) / 58);
            this.field10209.method1579(-30, arg0);
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field10210[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(Ljfa;B)Ljava/lang/String;"
   )
   public static final String method5058(class303 arg0, byte arg1) {
      try {
         ++field10194;
         if (~client.method2454(arg0).method5160(false) == -1) {
            return null;
         } else if (arg1 != 80) {
            return null;
         } else if (arg0.field4360 != null && ~arg0.field4360.trim().length() != -1) {
            return arg0.field4360;
         } else {
            return class589.field8508 ? field10210[3] : null;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10210[1] + (arg0 != null ? field10210[2] : field10210[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(BI[Ljfa;)V"
   )
   public static final void method5059(byte param0, int param1, class303[] param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ab",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method5060(byte arg0) {
      try {
         ++field10205;
         class179 var2 = this.field10199;
         synchronized(this.field10199) {
            this.field10199.method1591((byte)58);
         }

         class179 var3 = this.field10209;
         synchronized(this.field10209) {
            this.field10209.method1591((byte)58);
         }

         if (arg0 != 53) {
            this.field10209 = null;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field10210[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5061(int arg0) {
      try {
         field10196 = null;
         if (arg0 != 5) {
            method5064((String)null, -43, (String)null);
         }

         field10195 = null;
         field10200 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10210[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method5062(int arg0, int arg1, int arg2) {
      try {
         int var4 = -32 % ((arg1 - -66) / 60);
         ++field10203;
         this.field10199 = new class179(arg0);
         this.field10209 = new class179(arg2);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field10210[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(BI)Z"
   )
   public static final boolean method5063(byte arg0, int arg1) {
      try {
         if (arg0 != -35) {
            return false;
         } else {
            ++field10202;
            return arg1 == 1 || ~arg1 == -4 || arg1 == 5;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10210[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(Ljava/lang/String;ILjava/lang/String;)V"
   )
   public static final void method5064(String arg0, int arg1, String arg2) {
      try {
         ++field10192;
         if (~arg0.length() >= -321) {
            if (class352.method2708(96)) {
               int var3 = 21 / ((arg1 - -31) / 32);
               if (class361.field5404 != null) {
                  class361.field5404.method2045(907867169);
                  class361.field5404 = null;
               }

               class194.method1686(-20370);
               class386.field5693 = arg0;
               class741.field10672 = arg2;
               class645.method4735(5, -123);
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10210[7] + (arg0 != null ? field10210[2] : field10210[0]) + ',' + arg1 + ',' + (arg2 != null ? field10210[2] : field10210[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method5065(byte arg0) {
      try {
         class179 var2 = this.field10199;
         synchronized(this.field10199) {
            this.field10199.method1589((byte)78);
         }

         ++field10201;
         class179 var3 = this.field10209;
         synchronized(this.field10209) {
            this.field10209.method1589((byte)104);
         }

         if (arg0 < 59) {
            this.method5062(-125, -114, -125);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field10210[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "<init>",
      descriptor = "(Lca;ILhw;Lhw;)V"
   )
   public class696(class320 arg0, int arg1, class141 arg2, class141 arg3) {
      try {
         this.field10204 = arg2;
         this.field10193 = arg3;
         this.field10204.method1346(34, 0);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field10210[6] + (arg0 != null ? field10210[2] : field10210[0]) + ',' + arg1 + ',' + (arg2 != null ? field10210[2] : field10210[0]) + ',' + (arg3 != null ? field10210[2] : field10210[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5066(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 72);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ab",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5067(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 72;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
