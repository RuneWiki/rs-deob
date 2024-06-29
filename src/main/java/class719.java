import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class719 extends class555 {
   @OriginalMember(
      owner = "client!bw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10539 = new String[]{method5229(method5228("\u001374.$")), method5229(method5228("\u001374)$")), method5229(method5228("\u001374,$")), method5229(method5228("\u001374($")), method5229(method5228("\u001374-$")), method5229(method5228("\u001374*$")), method5229(method5228("\u001374/$")), method5229(method5228("\u001374#$"))};
   @OriginalMember(
      owner = "client!bw",
      name = "m",
      descriptor = "Lod;"
   )
   public static class536 field10527 = new class536();
   @OriginalMember(
      owner = "client!bw",
      name = "q",
      descriptor = "[I"
   )
   public static int[] field10534 = new int[1];
   @OriginalMember(
      owner = "client!bw",
      name = "p",
      descriptor = "Lafa;"
   )
   public static class365 field10533 = new class365(2, 2);
   @OriginalMember(
      owner = "client!bw",
      name = "i",
      descriptor = "I"
   )
   public static int field10538 = 0;
   @OriginalMember(
      owner = "client!bw",
      name = "f",
      descriptor = "I"
   )
   public static int field10528;
   @OriginalMember(
      owner = "client!bw",
      name = "n",
      descriptor = "I"
   )
   public static int field10529;
   @OriginalMember(
      owner = "client!bw",
      name = "j",
      descriptor = "I"
   )
   public static int field10530;
   @OriginalMember(
      owner = "client!bw",
      name = "g",
      descriptor = "I"
   )
   public static int field10531;
   @OriginalMember(
      owner = "client!bw",
      name = "h",
      descriptor = "I"
   )
   public static int field10532;
   @OriginalMember(
      owner = "client!bw",
      name = "k",
      descriptor = "I"
   )
   public static int field10535;
   @OriginalMember(
      owner = "client!bw",
      name = "l",
      descriptor = "I"
   )
   public static int field10536;
   @OriginalMember(
      owner = "client!bw",
      name = "o",
      descriptor = "Lbo;"
   )
   public static class763 field10537;

   @OriginalMember(
      owner = "client!bw",
      name = "c",
      descriptor = "(IB)V"
   )
   public static final void method5224(int arg0, byte arg1) {
      try {
         ++field10536;
         class446 var2 = class635.method4607(110, (long)arg0, 2);
         int var3 = -34 % ((arg1 - 21) / 63);
         var2.method3312(-116);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10539[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method5225(byte arg0) {
      try {
         if (arg0 >= -61) {
            field10534 = null;
         }

         ++field10532;
         return super.field7632;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10539[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method5226(byte arg0) {
      boolean var1 = client.field4273;

      RuntimeException var10000;
      label42: {
         boolean var10001;
         class149 var2;
         try {
            ++field10535;
            var2 = (class149)class109.field1381.method1850(0);
            if (arg0 != -19) {
               return;
            }
         } catch (RuntimeException var7) {
            var10000 = var7;
            var10001 = false;
            break label42;
         }

         while(true) {
            label37: {
               label36: {
                  try {
                     if (var2 != null) {
                        if (!var2.field1944) {
                           class240.method1799((byte)125, var2.field1946);
                           if (!var1) {
                              break label37;
                           }
                        }
                        break label36;
                     }
                  } catch (RuntimeException var6) {
                     var10000 = var6;
                     var10001 = false;
                     break;
                  }

                  if (!var1) {
                     return;
                  }
               }

               try {
                  var2.field1944 = false;
               } catch (RuntimeException var5) {
                  var10000 = var5;
                  var10001 = false;
                  break;
               }
            }

            try {
               var2 = (class149)class109.field1381.method1847(122);
            } catch (RuntimeException var4) {
               var10000 = var4;
               var10001 = false;
               break;
            }
         }
      }

      RuntimeException var3 = var10000;
      throw class534.method3846(var3, field10539[7] + arg0 + ')');
   }

   @OriginalMember(
      owner = "client!bw",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method633(int arg0, byte arg1) {
      try {
         ++field10530;
         if (arg1 <= 36) {
            field10533 = null;
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field10539[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method637(int arg0) {
      try {
         if (arg0 != -13712) {
            method5226((byte)-54);
         }

         ++field10528;
         if (~super.field7632 != -2 && ~super.field7632 != -1) {
            super.field7632 = this.method635(arg0 ^ -13809);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10539[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class719(int arg0, class605 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!bw",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method635(int arg0) {
      try {
         if (arg0 < 124) {
            return 6;
         } else {
            ++field10529;
            return 1;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10539[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class719(class605 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!bw",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method638(int arg0, byte arg1) {
      try {
         int var3 = -92 / ((arg1 - 12) / 47);
         ++field10531;
         super.field7632 = arg0;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10539[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method5227(int arg0) {
      try {
         field10537 = null;
         field10533 = null;
         if (arg0 == 2) {
            field10527 = null;
            field10534 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10539[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5228(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5229(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 113;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 26;
            break;
         case 3:
            var10005 = 107;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
