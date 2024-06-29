import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class746 {
   @OriginalMember(
      owner = "client!pba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11076 = new String[]{method5485(method5484("aZ,z\f9")), method5485(method5484("\u007fM!8")), method5485(method5484("j\u0016cz0")), method5485(method5484("aZ,z\b9")), method5485(method5484("aZ,z\u000e9")), method5485(method5484("aZ,z\u000f9")), method5485(method5484("XV;5!x\\m\u0013\u0017Xhm7\"|H?1>b])t)pL,u")), method5485(method5484("aZ,z\t9")), method5485(method5484("XV;5!x\\m\u0013\u0017Xhm<(p\\(&l"))};
   @OriginalMember(
      owner = "client!pba",
      name = "g",
      descriptor = "I"
   )
   public static int field11069 = 0;
   @OriginalMember(
      owner = "client!pba",
      name = "h",
      descriptor = "I"
   )
   public static int field11075 = 1407;
   @OriginalMember(
      owner = "client!pba",
      name = "d",
      descriptor = "I"
   )
   public static int field11068;
   @OriginalMember(
      owner = "client!pba",
      name = "f",
      descriptor = "I"
   )
   public static int field11070;
   @OriginalMember(
      owner = "client!pba",
      name = "e",
      descriptor = "I"
   )
   public static int field11072;
   @OriginalMember(
      owner = "client!pba",
      name = "b",
      descriptor = "I"
   )
   public static int field11073;
   @OriginalMember(
      owner = "client!pba",
      name = "c",
      descriptor = "I"
   )
   public static int field11074;
   @OriginalMember(
      owner = "client!pba",
      name = "a",
      descriptor = "Ljava/util/zip/Inflater;"
   )
   private Inflater field11071;

   @OriginalMember(
      owner = "client!pba",
      name = "a",
      descriptor = "(Lmq;I)[I"
   )
   public static final int[] method5479(class577 arg0, int arg1) {
      boolean var2 = client.field1786;

      try {
         ++field11068;
         class354 var3 = new class354(518);
         int[] var4 = new int[4];
         int var5 = arg1;
         if (var2) {
            var4[arg1] = (int)(Math.random() * 9.9999999E7D);
            var5 = arg1 + 1;
         }

         while(true) {
            while(~var5 > -5) {
               var4[var5] = (int)(Math.random() * 9.9999999E7D);
               ++var5;
            }

            var3.method2864(-26110, 10);
            var3.method2849(var4[0], (byte)-34);
            var3.method2849(var4[1], (byte)-34);
            var3.method2849(var4[2], (byte)-34);
            var3.method2849(var4[3], (byte)-34);
            int var6 = 0;
            if (!var2) {
               if (var2) {
                  var3.method2849((int)(Math.random() * 9.9999999E7D), (byte)-34);
                  ++var6;
               }

               while(true) {
                  while(~var6 > -11) {
                     var3.method2849((int)(Math.random() * 9.9999999E7D), (byte)-34);
                     ++var6;
                  }

                  var3.method2873((int)(Math.random() * 9.9999999E7D), (byte)-122);
                  var3.method2878((byte)125, class361.field5587, class371.field5755);
                  arg0.field8531.method2858(var3.field5436, 427497672, 0, var3.field5428);
                  if (!var2) {
                     return var4;
                  }

                  ++var6;
               }
            }

            ++var5;
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field11076[4] + (arg0 != null ? field11076[2] : field11076[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "a",
      descriptor = "(Ljava/lang/String;I[BI)I"
   )
   public static final int method5480(String arg0, int arg1, byte[] arg2, int arg3) {
      boolean var4 = client.field1786;

      try {
         if (arg1 != -29061) {
            method5481(87, -7);
         }

         ++field11074;
         int var5 = arg3;
         int var6 = arg0.length();
         int var7 = 0;
         int var10000;
         if (var4) {
            var10000 = class703.method5177(arg0.charAt(var7), 104);
         } else if (var7 >= var6) {
            var10000 = -arg3 + arg3;
            if (!var4) {
               return var10000;
            }
         } else {
            var10000 = class703.method5177(arg0.charAt(var7), 104);
         }

         do {
            while(true) {
               int var8 = var10000;
               int var9 = var7 + 1 < var6 ? class703.method5177(arg0.charAt(var7 + 1), arg1 ^ -29178) : -1;
               int var10 = var7 + 2 >= var6 ? -1 : class703.method5177(arg0.charAt(var7 + 2), 127);
               int var11 = ~(var7 - -3) <= ~var6 ? -1 : class703.method5177(arg0.charAt(var7 + 3), 126);
               arg2[arg3++] = (byte)class119.method1087(var8 << 2, var9 >>> 4);
               if (~var10 == 0 && !var4) {
                  var10000 = -var5 + arg3;
                  break;
               }

               arg2[arg3++] = (byte)class119.method1087(class408.method3277(15, var9) << 4, var10 >>> 2);
               if (var11 == -1) {
                  if (!var4) {
                     var10000 = -var5 + arg3;
                     if (!var4) {
                        return var10000;
                     }
                     continue;
                  }

                  arg2[arg3++] = (byte)class119.method1087(class408.method3277(var10, 3) << 6, var11);
                  var7 += 4;
               } else {
                  arg2[arg3++] = (byte)class119.method1087(class408.method3277(var10, 3) << 6, var11);
                  var7 += 4;
               }

               if (var7 >= var6) {
                  var10000 = -var5 + arg3;
                  if (!var4) {
                     return var10000;
                  }
               } else {
                  var10000 = class703.method5177(arg0.charAt(var7), 104);
               }
            }
         } while(var4);

         return var10000;
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field11076[0] + (arg0 != null ? field11076[2] : field11076[1]) + ',' + arg1 + ',' + (arg2 != null ? field11076[2] : field11076[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method5481(int arg0, int arg1) {
      try {
         ++field11072;
         if (arg0 != 31769) {
            method5479((class577)null, -22);
         }

         return arg1 == 4 || arg1 == 46 || ~arg1 == -1005 || ~arg1 == -21 || arg1 == 50;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11076[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "a",
      descriptor = "([BILica;)V"
   )
   public final void method5482(byte[] arg0, int arg1, class354 arg2) {
      try {
         ++field11070;
         if (~arg2.field5428[arg2.field5436] == -32 && ~arg2.field5428[arg2.field5436 + 1] == 116) {
            if (this.field11071 == null) {
               this.field11071 = new Inflater(true);
            }

            try {
               this.field11071.setInput(arg2.field5428, arg2.field5436 - -10, arg2.field5428.length + -8 + -arg2.field5436 + -10);
               this.field11071.inflate(arg0);
            } catch (Exception var5) {
               this.field11071.reset();
               throw new RuntimeException(field11076[6]);
            }

            this.field11071.reset();
            if (arg1 != -1593955902) {
               this.field11071 = null;
            }
         } else {
            throw new RuntimeException(field11076[8]);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field11076[7] + (arg0 != null ? field11076[2] : field11076[1]) + ',' + arg1 + ',' + (arg2 != null ? field11076[2] : field11076[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "<init>",
      descriptor = "()V"
   )
   public class746() {
      this(-1, 1000000, 1000000);
   }

   @OriginalMember(
      owner = "client!pba",
      name = "<init>",
      descriptor = "(III)V"
   )
   private class746(int arg0, int arg1, int arg2) {
   }

   @OriginalMember(
      owner = "client!pba",
      name = "a",
      descriptor = "(I[B)[B"
   )
   public final byte[] method5483(int arg0, byte[] arg1) {
      try {
         ++field11073;
         class354 var3 = new class354(arg1);
         var3.field5436 = arg1.length + arg0;
         int var4 = var3.method2839((byte)-20);
         byte[] var5 = new byte[var4];
         var3.field5436 = 0;
         this.method5482(var5, -1593955902, var3);
         return var5;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field11076[3] + arg0 + ',' + (arg1 != null ? field11076[2] : field11076[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5484(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5485(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 56;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
