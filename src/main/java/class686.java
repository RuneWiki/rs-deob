import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class686 {
   @OriginalMember(
      owner = "client!lw",
      name = "c",
      descriptor = "Liw;"
   )
   private class332 field10090;
   @OriginalMember(
      owner = "client!lw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10096 = new String[]{method5006(method5005("#\u001d\u0010\u0019\u0006\\O")), method5006(method5005("C_\u0003")), method5006(method5005("\n\u0018L2\\")), method5006(method5005("\n\u0018L5\\")), method5006(method5005("\u001dALX\t")), method5006(method5005("\b\u001a\u000e\u001a")), method5006(method5005("\n\u0018L>\\")), method5006(method5005("\n\u0018LJ\u001d\b\u0006\u0016H\\")), method5006(method5005("\n\u0018L1\\")), method5006(method5005("\n\u0018L4\\")), method5006(method5005("\n\u0018L3\\")), method5006(method5005("\n\u0018L7\\"))};
   @OriginalMember(
      owner = "client!lw",
      name = "b",
      descriptor = "Liw;"
   )
   public static class332 field10086 = new class332();
   @OriginalMember(
      owner = "client!lw",
      name = "g",
      descriptor = "Lgh;"
   )
   public static class572 field10094 = new class572(8, -1);
   @OriginalMember(
      owner = "client!lw",
      name = "d",
      descriptor = "I"
   )
   public static int field10084;
   @OriginalMember(
      owner = "client!lw",
      name = "j",
      descriptor = "I"
   )
   public static int field10085;
   @OriginalMember(
      owner = "client!lw",
      name = "h",
      descriptor = "I"
   )
   public static int field10087;
   @OriginalMember(
      owner = "client!lw",
      name = "l",
      descriptor = "I"
   )
   public static int field10089;
   @OriginalMember(
      owner = "client!lw",
      name = "i",
      descriptor = "I"
   )
   public static int field10091;
   @OriginalMember(
      owner = "client!lw",
      name = "a",
      descriptor = "I"
   )
   public static int field10092;
   @OriginalMember(
      owner = "client!lw",
      name = "f",
      descriptor = "I"
   )
   public static int field10093;
   @OriginalMember(
      owner = "client!lw",
      name = "k",
      descriptor = "I"
   )
   public static int field10095;
   @OriginalMember(
      owner = "client!lw",
      name = "e",
      descriptor = "Lub;"
   )
   private class22 field10088;

   @OriginalMember(
      owner = "client!lw",
      name = "a",
      descriptor = "(Liw;B)V",
      line = 3
   )
   public final void method4997(class332 arg0, byte arg1) {
      try {
         int var3 = -64 / ((70 - arg1) / 55);
         ++field10091;
         this.field10090 = arg0;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10096[10] + (arg0 != null ? field10096[4] : field10096[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "a",
      descriptor = "(IIIZII)V",
      line = 14
   )
   public static final void method4998(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
      boolean var6 = client.field4564;

      try {
         ++field10092;
         long var7 = (long)(arg1 | (!arg3 ? 0 : Integer.MIN_VALUE));
         class349 var9 = (class349)class310.field4469.method1572(var7, -16289);
         if (var9 == null) {
            var9 = new class349();
            class310.field4469.method1566(var9, 24742, var7);
         }

         if (var9.field4963.length <= arg5) {
            int[] var10 = new int[arg5 - -1];
            int[] var11 = new int[arg5 + 1];
            int var12 = 0;
            if (var6) {
               var10[var12] = var9.field4963[var12];
               var11[var12] = var9.field4964[var12];
               ++var12;
            }

            label72:
            while(true) {
               while(var12 < var9.field4963.length) {
                  var10[var12] = var9.field4963[var12];
                  var11[var12] = var9.field4964[var12];
                  ++var12;
               }

               int var13 = var9.field4963.length;
               if (!var6) {
                  if (var6) {
                     var10[var13] = -1;
                     var11[var13] = 0;
                     ++var13;
                  }

                  while(true) {
                     while(~arg5 < ~var13) {
                        var10[var13] = -1;
                        var11[var13] = 0;
                        ++var13;
                     }

                     var9.field4963 = var10;
                     if (!var6) {
                        var9.field4964 = var11;
                        break label72;
                     }

                     ++var13;
                  }
               }

               ++var12;
            }
         }

         var9.field4963[arg5] = arg4;
         var9.field4964[arg5] = arg2;
         if (arg0 != -1) {
            field10094 = null;
         }
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field10096[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "a",
      descriptor = "(ILjava/lang/String;)V",
      line = 73
   )
   public static final void method4999(int arg0, String arg1) {
      System.out.println(field10096[0] + class516.method3902(arg0 ^ 18248, field10096[1], arg1, "\n"));
      if (arg0 == -18234) {
         ++field10084;
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "a",
      descriptor = "(B)Lub;",
      line = 88
   )
   public final class22 method5000(byte arg0) {
      try {
         ++field10093;
         class22 var2 = this.field10090.field4749.field346;
         if (this.field10090.field4749 == var2) {
            this.field10088 = null;
            return null;
         } else {
            if (arg0 <= 97) {
               this.method5004(-118);
            }

            this.field10088 = var2.field346;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10096[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "a",
      descriptor = "(I)V",
      line = 109
   )
   public static void method5001(int arg0) {
      try {
         if (arg0 >= 19) {
            field10086 = null;
            field10094 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10096[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "a",
      descriptor = "(IIZ)V",
      line = 121
   )
   public static final void method5002(int arg0, int arg1, boolean arg2) {
      try {
         ++field10087;
         class536 var3 = class108.method1038((long)arg0, 66, 16);
         if (arg2) {
            field10086 = null;
         }

         var3.method4017(24076);
         var3.field7800 = arg1;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10096[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "a",
      descriptor = "(BLjfa;)V",
      line = 142
   )
   public static final void method5003(byte arg0, class303 arg1) {
      try {
         if (arg1.field4270 == 5 && arg1.field4346 != -1) {
            class408.method3130(-16777216, class444.field6473, arg1);
         }

         ++field10085;
         if (arg0 >= -16) {
            field10095 = 33;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10096[6] + arg0 + ',' + (arg1 != null ? field10096[4] : field10096[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "<init>",
      descriptor = "()V",
      line = 154
   )
   public class686() {
   }

   @OriginalMember(
      owner = "client!lw",
      name = "b",
      descriptor = "(I)Lub;",
      line = 158
   )
   public final class22 method5004(int arg0) {
      try {
         ++field10089;
         class22 var2 = this.field10088;
         if (arg0 != -10649) {
            return null;
         } else if (this.field10090.field4749 == var2) {
            this.field10088 = null;
            return null;
         } else {
            this.field10088 = var2.field346;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10096[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "<init>",
      descriptor = "(Liw;)V",
      line = 185
   )
   public class686(class332 arg0) {
      try {
         this.field10090 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10096[7] + (arg0 != null ? field10096[4] : field10096[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5005(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 116);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5006(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 116;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
