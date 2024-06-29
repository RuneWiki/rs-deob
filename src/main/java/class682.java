import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class682 {
   @OriginalMember(
      owner = "client!fo",
      name = "k",
      descriptor = "I"
   )
   public int field10038 = 0;
   @OriginalMember(
      owner = "client!fo",
      name = "e",
      descriptor = "I"
   )
   public int field10042 = 0;
   @OriginalMember(
      owner = "client!fo",
      name = "h",
      descriptor = "Lsia;"
   )
   private class407 field10036 = new class407(64);
   @OriginalMember(
      owner = "client!fo",
      name = "g",
      descriptor = "Lsh;"
   )
   private class290 field10044 = null;
   @OriginalMember(
      owner = "client!fo",
      name = "b",
      descriptor = "Lww;"
   )
   private class339 field10037;
   @OriginalMember(
      owner = "client!fo",
      name = "j",
      descriptor = "Lww;"
   )
   private class339 field10035;
   @OriginalMember(
      owner = "client!fo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10045 = new String[]{method4971(method4970("o3%\u0017")), method4971(method4970("g)g:\n")), method4971(method4970("zhgU_")), method4971(method4970("g)g8\n")), method4971(method4970("g)g?\n")), method4971(method4970("g)gGKo/=E\n")), method4971(method4970("g)g9\n"))};
   @OriginalMember(
      owner = "client!fo",
      name = "i",
      descriptor = "I"
   )
   public static int field10034;
   @OriginalMember(
      owner = "client!fo",
      name = "c",
      descriptor = "I"
   )
   public static int field10039;
   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "I"
   )
   public static int field10041;
   @OriginalMember(
      owner = "client!fo",
      name = "f",
      descriptor = "I"
   )
   public static int field10043;
   @OriginalMember(
      owner = "client!fo",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field10040;

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(JLfea;[IB)Ljava/lang/String;"
   )
   public final String method4966(long arg0, class681 arg1, int[] arg2, byte arg3) {
      try {
         ++field10039;
         if (this.field10044 != null) {
            String var6 = this.field10044.method2347(arg1, (byte)-91, arg2, arg0);
            if (var6 != null) {
               return var6;
            }
         }

         return arg3 < 12 ? null : Long.toString(arg0);
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field10045[3] + arg0 + ',' + (arg1 != null ? field10045[2] : field10045[0]) + ',' + (arg2 != null ? field10045[2] : field10045[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(Ljava/lang/String;Z)I"
   )
   public static final int method4967(String arg0, boolean arg1) {
      boolean var2 = client.field1481;

      try {
         if (arg1) {
            method4967((String)null, false);
         }

         ++field10034;
         if (arg0 == null) {
            return -1;
         } else {
            int var3 = 0;
            if (var2) {
               if (arg0.equalsIgnoreCase(class35.field495[var3])) {
                  return var3;
               }

               ++var3;
            }

            while(true) {
               while(var3 < class202.field2575) {
                  if (arg0.equalsIgnoreCase(class35.field495[var3])) {
                     return var3;
                  }

                  ++var3;
               }

               if (!var2) {
                  return -1;
               }

               if (-1 != 0) {
                  return var3;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field10045[1] + (arg0 != null ? field10045[2] : field10045[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(Lww;IILww;)V"
   )
   public static final void method4968(class339 arg0, int arg1, int arg2, class339 arg3) {
      try {
         if (arg2 != 32768) {
            field10040 = false;
         }

         ++field10041;
         class550.field8111 = arg0;
         class791.field11579 = arg3;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field10045[6] + (arg0 != null ? field10045[2] : field10045[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10045[2] : field10045[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(IB)Lqm;"
   )
   public final class490 method4969(int arg0, byte arg1) {
      try {
         ++field10043;
         class490 var3 = (class490)this.field10036.method3192((long)arg0, (byte)-107);
         if (var3 != null) {
            return var3;
         } else {
            byte[] var4;
            label25: {
               if (arg0 >= 32768) {
                  var4 = this.field10037.method2697(32767 & arg0, 1, false);
                  if (!client.field1481) {
                     break label25;
                  }
               }

               var4 = this.field10035.method2697(arg0, 1, false);
            }

            class490 var5 = new class490();
            int var6 = -59 / ((arg1 - -68) / 38);
            var5.field6852 = this;
            if (var4 != null) {
               var5.method3725(new class66(var4), (byte)-119);
            }

            if (arg0 >= 32768) {
               var5.method3721(0);
            }

            this.field10036.method3190(var5, (long)arg0, 8);
            return var5;
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field10045[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "<init>",
      descriptor = "(ILww;Lww;Lsh;)V"
   )
   public class682(int arg0, class339 arg1, class339 arg2, class290 arg3) {
      try {
         this.field10037 = arg2;
         this.field10035 = arg1;
         this.field10044 = arg3;
         if (this.field10035 != null) {
            this.field10038 = this.field10035.method2691(1, 126);
         }

         if (this.field10037 != null) {
            this.field10042 = this.field10037.method2691(1, -120);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field10045[5] + arg0 + ',' + (arg1 != null ? field10045[2] : field10045[0]) + ',' + (arg2 != null ? field10045[2] : field10045[0]) + ',' + (arg3 != null ? field10045[2] : field10045[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4970(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4971(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 1;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
