import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class374 {
   @OriginalMember(
      owner = "client!vca",
      name = "b",
      descriptor = "Liw;"
   )
   private class107 field5465 = new class107(64);
   @OriginalMember(
      owner = "client!vca",
      name = "d",
      descriptor = "Lsa;"
   )
   private class39 field5467;
   @OriginalMember(
      owner = "client!vca",
      name = "e",
      descriptor = "Lsa;"
   )
   private class39 field5466;
   @OriginalMember(
      owner = "client!vca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5468 = new String[]{method2930(method2929("eph1*;")), method2930(method2929("eph1Wz}`kU;")), method2930(method2929("h='1\u0016")), method2930(method2929("}fes")), method2930(method2929("eph1(;"))};
   @OriginalMember(
      owner = "client!vca",
      name = "c",
      descriptor = "I"
   )
   public static int field5463;
   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "[Liaa;"
   )
   public static class433[] field5464;

   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "(Ldea;Z[[[BIB)Z"
   )
   public static final boolean method2926(class471 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
      if (!class343.field5048) {
         return false;
      } else {
         int var5 = arg0.field6832 >> class313.field4707;
         int var6 = var5;
         int var7 = arg0.field6833 >> class313.field4707;
         int var8 = var7;
         if (arg0 instanceof class578) {
            var6 = ((class578)arg0).field8150;
            var8 = ((class578)arg0).field8155;
            var5 = ((class578)arg0).field8154;
            var7 = ((class578)arg0).field8160;
         }

         for(int var9 = var5; var9 <= var6; ++var9) {
            for(int var10 = var7; var10 <= var8; ++var10) {
               if (arg0.field6826 < class522.field7337 && var9 >= class583.field8194 && var9 < class714.field10249 && var10 >= class340.field5008 && var10 < class521.field7328) {
                  if ((arg2 == null || arg0.field6824 < arg3 || arg2[arg0.field6824][var9][var10] != arg4) && arg0.method1685(-1) && !arg0.method1682(class720.field10315, 1)) {
                     return false;
                  }

                  if (!arg1 && var9 >= class507.field7207 - 16 && var9 <= class507.field7207 + 16 && var10 >= class477.field6876 - 16 && var10 <= class477.field6876 + 16) {
                     if (class684.field9885) {
                        class164.field2483[class421.field6134++].method5097(arg0, false);
                        class421.field6134 %= class14.field198;
                     } else {
                        arg0.method726(class720.field10315, (byte)125);
                     }
                  }
               }
            }
         }

         return true;
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2927(int arg0) {
      try {
         if (arg0 != 16) {
            method2927(57);
         }

         field5464 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5468[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "(BI)Ljs;"
   )
   public final class5 method2928(byte arg0, int arg1) {
      try {
         ++field5463;
         class5 var3 = (class5)this.field5465.method1041((long)arg1, 8);
         if (var3 != null) {
            return var3;
         } else {
            byte[] var4;
            label29: {
               if (arg1 < 32768) {
                  var4 = this.field5467.method460((byte)-11, arg1, 0);
                  if (!client.field10022) {
                     break label29;
                  }
               }

               var4 = this.field5466.method460((byte)-11, arg1 & 32767, 0);
            }

            class5 var5 = new class5();
            if (var4 != null) {
               var5.method37(arg0 ^ 79, new class65(var4));
            }

            if (~arg1 <= -32769) {
               var5.method39(-41);
            }

            this.field5465.method1050(-62, var5, (long)arg1);
            return arg0 != 79 ? null : var5;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field5468[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "<init>",
      descriptor = "(ILsa;Lsa;)V"
   )
   public class374(int arg0, class39 arg1, class39 arg2) {
      try {
         this.field5467 = arg1;
         this.field5466 = arg2;
         if (this.field5467 != null) {
            this.field5467.method434((byte)-106, 0);
         }

         if (this.field5466 != null) {
            this.field5466.method434((byte)-106, 0);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5468[1] + arg0 + ',' + (arg1 != null ? field5468[2] : field5468[3]) + ',' + (arg2 != null ? field5468[2] : field5468[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2929(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2930(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
