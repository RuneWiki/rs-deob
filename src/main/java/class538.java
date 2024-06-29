import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class538 {
   @OriginalMember(
      owner = "client!uca",
      name = "c",
      descriptor = "Ldw;"
   )
   private class748 field7862 = new class748(64);
   @OriginalMember(
      owner = "client!uca",
      name = "i",
      descriptor = "Leaa;"
   )
   private class526 field7868;
   @OriginalMember(
      owner = "client!uca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7871 = new String[]{method3997(method3996("\t\u0015=~~T")), method3997(method3996("\t\u0015=~|T")), method3997(method3996("\t\u0015=~rT")), method3997(method3996("\t\u0015=~yT")), method3997(method3996("\t\u0015=~\u007fT")), method3997(method3996("\t\u0015=~}T")), method3997(method3996("\t\u0015=~{T")), method3997(method3996("\u0012\u00030<")), method3997(method3996("\t\u0015=~\u0006\u0015\u00185$\u0004T")), method3997(method3996("\u0007Xr~G")), method3997(method3996("\t\u0015=~sT"))};
   @OriginalMember(
      owner = "client!uca",
      name = "b",
      descriptor = "I"
   )
   public static int field7860 = 0;
   @OriginalMember(
      owner = "client!uca",
      name = "n",
      descriptor = "I"
   )
   public static int field7867 = -1;
   @OriginalMember(
      owner = "client!uca",
      name = "m",
      descriptor = "I"
   )
   public static int field7857;
   @OriginalMember(
      owner = "client!uca",
      name = "k",
      descriptor = "I"
   )
   public static int field7858;
   @OriginalMember(
      owner = "client!uca",
      name = "d",
      descriptor = "I"
   )
   public static int field7859;
   @OriginalMember(
      owner = "client!uca",
      name = "l",
      descriptor = "I"
   )
   public static int field7861;
   @OriginalMember(
      owner = "client!uca",
      name = "e",
      descriptor = "I"
   )
   public static int field7863;
   @OriginalMember(
      owner = "client!uca",
      name = "g",
      descriptor = "I"
   )
   public static int field7865;
   @OriginalMember(
      owner = "client!uca",
      name = "a",
      descriptor = "I"
   )
   public static int field7866;
   @OriginalMember(
      owner = "client!uca",
      name = "f",
      descriptor = "I"
   )
   public static int field7869;
   @OriginalMember(
      owner = "client!uca",
      name = "h",
      descriptor = "I"
   )
   public static int field7870;
   @OriginalMember(
      owner = "client!uca",
      name = "j",
      descriptor = "Ljj;"
   )
   public static class128 field7864;

   @OriginalMember(
      owner = "client!uca",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;)Ljava/lang/String;",
      line = 7
   )
   public static final String method3987(String arg0, String arg1, byte arg2, String arg3) {
      int var4 = client.field4530;
      if (arg2 != -72) {
         field7864 = null;
      }

      ++field7866;
      int var5 = arg1.indexOf(arg3);
      if (var4 != 0) {
         arg1 = arg1.substring(0, var5) + arg0 + arg1.substring(arg3.length() + var5);
         var5 = arg1.indexOf(arg3, arg0.length() + var5);
      }

      while(true) {
         while(~var5 != 0) {
            arg1 = arg1.substring(0, var5) + arg0 + arg1.substring(arg3.length() + var5);
            var5 = arg1.indexOf(arg3, arg0.length() + var5);
         }

         if (var4 == 0) {
            return arg1;
         }

         var5 = arg1.indexOf(arg3, arg0.length() + var5);
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "c",
      descriptor = "(II)V",
      line = 26
   )
   public final void method3988(int arg0, int arg1) {
      try {
         ++field7857;
         if (arg0 > 59) {
            class748 var3 = this.field7862;
            synchronized(this.field7862) {
               this.field7862.method5453(arg1, false);
            }
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field7871[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "a",
      descriptor = "(II)V",
      line = 41
   )
   public final void method3989(int arg0, int arg1) {
      try {
         ++field7861;
         class748 var3 = this.field7862;
         synchronized(this.field7862) {
            this.field7862.method5451(48);
            this.field7862 = new class748(arg1);
            if (arg0 > -33) {
               this.method3995((byte)-41);
            }

         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field7871[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "b",
      descriptor = "(B)I",
      line = 61
   )
   public static final int method3990(byte arg0) {
      try {
         if (arg0 != 25) {
            return -123;
         } else {
            ++field7858;
            return class687.method4995((byte)-1, false);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7871[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "c",
      descriptor = "(B)V",
      line = 77
   )
   public static void method3991(byte arg0) {
      try {
         if (arg0 <= -81) {
            field7864 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7871[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;BC)Ljava/lang/String;",
      line = 93
   )
   public static final String method3992(String arg0, String arg1, byte arg2, char arg3) {
      int var4 = client.field4530;

      try {
         if (arg2 > -67) {
            return null;
         } else {
            ++field7865;
            int var5 = arg0.length();
            int var6 = arg1.length();
            int var7 = var5;
            int var8 = var6 + -1;
            if (~var8 != -1) {
               int var9 = 0;

               do {
                  var9 = arg0.indexOf(arg3, var9);
                  if (var9 < 0) {
                     break;
                  }

                  var7 += var8;
                  ++var9;
               } while(var4 == 0);
            }

            StringBuffer var10 = new StringBuffer(var7);
            int var11 = 0;

            while(true) {
               int var12 = arg0.indexOf(arg3, var11);
               if (var12 >= 0) {
                  var10.append(arg0.substring(var11, var12));
                  var11 = var12 + 1;
                  var10.append(arg1);
                  if (var4 != 0) {
                     break;
                  }

                  if (var4 == 0) {
                     continue;
                  }
               }

               var10.append(arg0.substring(var11));
               break;
            }

            return var10.toString();
         }
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field7871[10] + (arg0 != null ? field7871[9] : field7871[7]) + ',' + (arg1 != null ? field7871[9] : field7871[7]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "b",
      descriptor = "(II)Lrs;",
      line = 149
   )
   public final class678 method3993(int arg0, int arg1) {
      try {
         ++field7859;
         class748 var3 = this.field7862;
         class678 var4;
         synchronized(this.field7862) {
            var4 = (class678)this.field7862.method5454((long)arg1, 18261);
            if (arg0 > -90) {
               this.method3994(-110);
            }
         }

         if (var4 != null) {
            return var4;
         } else {
            class526 var5 = this.field7868;
            byte[] var6;
            synchronized(this.field7868) {
               var6 = this.field7868.method3899(-107, class318.method2417(arg1, (byte)-97), class661.method4746(arg1, 3764));
            }

            class678 var7 = new class678();
            if (var6 != null) {
               var7.method4950(new class128(var6), (byte)-52);
            }

            class748 var8 = this.field7862;
            synchronized(this.field7862) {
               this.field7862.method5455(-2049, var7, (long)arg1);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field7871[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "a",
      descriptor = "(I)V",
      line = 180
   )
   public final void method3994(int arg0) {
      try {
         if (arg0 != 64) {
            this.field7862 = null;
         }

         ++field7869;
         class748 var2 = this.field7862;
         synchronized(this.field7862) {
            this.field7862.method5451(arg0 ^ 45);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7871[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "a",
      descriptor = "(B)V",
      line = 196
   )
   public final void method3995(byte arg0) {
      try {
         class748 var2 = this.field7862;
         synchronized(this.field7862) {
            this.field7862.method5445(697465426);
            if (arg0 != -78) {
               field7860 = 44;
            }
         }

         ++field7863;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7871[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "<init>",
      descriptor = "(Lqo;ILeaa;)V",
      line = 211
   )
   public class538(class24 arg0, int arg1, class526 arg2) {
      try {
         this.field7868 = arg2;
         if (this.field7868 != null) {
            int var4 = this.field7868.method3903((byte)-123) + -1;
            this.field7868.method3875(0, var4);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field7871[8] + (arg0 != null ? field7871[9] : field7871[7]) + ',' + arg1 + ',' + (arg2 != null ? field7871[9] : field7871[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3996(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3997(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 118;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
