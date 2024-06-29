import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class640 {
   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "Lgw;"
   )
   private class179 field9331 = new class179(128);
   @OriginalMember(
      owner = "client!mfa",
      name = "c",
      descriptor = "Lhw;"
   )
   private class141 field9326;
   @OriginalMember(
      owner = "client!mfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9332 = new String[]{method4691(method4690("N:y\u000e|\u000b")), method4691(method4690("N:y\u000eq\u000b")), method4691(method4690("N:y\u000eu\u000b")), method4691(method4690("N:y\u000ev\u000b")), method4691(method4690("Xr6\u000eI")), method4691(method4690("M)tL")), method4691(method4690("N:y\u000e\bJ2qT\n\u000b")), method4691(method4690("N:y\u000er\u000b")), method4691(method4690("N:y\u000es\u000b")), method4691(method4690("N:y\u000ep\u000b")), method4691(method4690("N:y\u000ew\u000b"))};
   @OriginalMember(
      owner = "client!mfa",
      name = "f",
      descriptor = "I"
   )
   public static int field9317 = 0;
   @OriginalMember(
      owner = "client!mfa",
      name = "i",
      descriptor = "[[I"
   )
   public static int[][] field9318 = new int[][]{{2, 4}, {2, 4}, {5, 2, 4}, {4, 5, 2}, {2, 4, 5}, {5, 2, 4}, {1, 6, 2, 5}, {1, 6, 7, 1}, {6, 7, 1, 1}, {0, 8, 9, 8, 9, 4}, {8, 9, 4, 0, 8, 9}, {2, 10, 0, 10, 11, 11}, {2, 4}, {1, 6, 7, 1}, {1, 6, 7, 1}};
   @OriginalMember(
      owner = "client!mfa",
      name = "g",
      descriptor = "I"
   )
   public static int field9323 = 0;
   @OriginalMember(
      owner = "client!mfa",
      name = "m",
      descriptor = "J"
   )
   public static long field9327 = -1L;
   @OriginalMember(
      owner = "client!mfa",
      name = "n",
      descriptor = "I"
   )
   public static int field9319;
   @OriginalMember(
      owner = "client!mfa",
      name = "h",
      descriptor = "I"
   )
   public static int field9320;
   @OriginalMember(
      owner = "client!mfa",
      name = "j",
      descriptor = "I"
   )
   public static int field9322;
   @OriginalMember(
      owner = "client!mfa",
      name = "d",
      descriptor = "I"
   )
   public static int field9324;
   @OriginalMember(
      owner = "client!mfa",
      name = "b",
      descriptor = "I"
   )
   public static int field9325;
   @OriginalMember(
      owner = "client!mfa",
      name = "e",
      descriptor = "I"
   )
   public static int field9328;
   @OriginalMember(
      owner = "client!mfa",
      name = "k",
      descriptor = "I"
   )
   public static int field9329;
   @OriginalMember(
      owner = "client!mfa",
      name = "l",
      descriptor = "I"
   )
   public static int field9330;
   @OriginalMember(
      owner = "client!mfa",
      name = "o",
      descriptor = "Lgh;"
   )
   public static class572 field9321;

   @OriginalMember(
      owner = "client!mfa",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4682(int arg0) {
      try {
         field9321 = null;
         if (arg0 != 2) {
            method4687(126);
         }

         field9318 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9332[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method4683(int arg0) {
      try {
         class179 var2 = this.field9331;
         synchronized(this.field9331) {
            if (arg0 != -23982) {
               this.field9331 = null;
            }

            this.field9331.method1589((byte)63);
         }

         ++field9330;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9332[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method4684(int arg0, int arg1) {
      try {
         class179 var3 = this.field9331;
         synchronized(this.field9331) {
            this.field9331.method1579(-91, arg0);
         }

         ++field9325;
         if (arg1 != -18554) {
            this.method4684(74, -9);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field9332[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(Lha;IIIII)V"
   )
   public static final void method4685(class65 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field9320;
         class393.field5787 = arg0;
         class718.field10369 = class393.field5787.method432();
         class88.field1436 = class393.field5787.method432();
         class56.field1115 = class393.field5787.method432();
         class493.field7174 = arg5;
         if (arg2 == -14950) {
            class74.field1314 = null;
            class402.field5939 = 0;
            class80.field1360 = null;
            class567.field8231 = arg3;
            class213.method1813(arg1, arg4, 32493);
            class528.field7696 = -1;
            class768.field11174 = -1;
            class302.field4214 = -1;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field9332[7] + (arg0 != null ? field9332[4] : field9332[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method4686(boolean arg0) {
      try {
         if (arg0) {
            method4689(-50, -119);
         }

         ++field9324;
         class179 var2 = this.field9331;
         synchronized(this.field9331) {
            this.field9331.method1591((byte)58);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9332[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "c",
      descriptor = "(I)Luda;"
   )
   public static final class473 method4687(int arg0) {
      try {
         ++field9319;
         class473 var1 = class275.method2164(74);
         var1.method3528(0L, (byte)126);
         var1.method3546((byte)-108, class741.field10672);
         var1.method3528(class749.field10797, (byte)122);
         var1.method3528(class647.field9402, (byte)116);
         if (arg0 >= -50) {
            field9329 = -97;
         }

         var1.method3551(0, class25.field370, class475.field6933);
         return var1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9332[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(ZI)Ll;"
   )
   public final class20 method4688(boolean arg0, int arg1) {
      try {
         ++field9328;
         class179 var3 = this.field9331;
         class20 var4;
         synchronized(this.field9331) {
            if (arg0) {
               field9318 = null;
            }

            var4 = (class20)this.field9331.method1584((long)arg1, 1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class141 var5 = this.field9326;
            byte[] var6;
            synchronized(this.field9326) {
               var6 = this.field9326.method1347((byte)123, 1, arg1);
            }

            class20 var7 = new class20();
            if (var6 != null) {
               var7.method145(new class473(var6), 0);
            }

            class179 var8 = this.field9331;
            synchronized(this.field9331) {
               this.field9331.method1581((long)arg1, 0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field9332[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "b",
      descriptor = "(II)Led;"
   )
   public static final class732 method4689(int arg0, int arg1) {
      try {
         ++field9322;
         class732 var2 = (class732)class616.field8954.method1584((long)arg0, 1);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = class123.field1968.method1347((byte)126, 1, arg0);
            class732 var4 = new class732();
            var4.field10526 = arg0;
            if (var3 != null) {
               var4.method5280(9087, new class473(var3));
            }

            var4.method5278((byte)81);
            if (var4.field10519 == 2 && class445.field6489.method1572((long)arg0, -16289) == null) {
               class445.field6489.method1566(new class459(class720.field10413), 24742, (long)arg0);
               class322.field4634[class720.field10413++] = var4;
            }

            class616.field8954.method1581((long)arg0, 0, var4);
            int var5 = 95 / ((arg1 - 49) / 55);
            return var4;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field9332[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "<init>",
      descriptor = "(Lca;ILhw;)V"
   )
   public class640(class320 arg0, int arg1, class141 arg2) {
      try {
         this.field9326 = arg2;
         this.field9326.method1346(1, 0);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9332[6] + (arg0 != null ? field9332[4] : field9332[5]) + ',' + arg1 + ',' + (arg2 != null ? field9332[4] : field9332[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4690(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4691(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
