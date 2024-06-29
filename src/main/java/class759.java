import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class759 {
   @OriginalMember(
      owner = "client!hb",
      name = "k",
      descriptor = "Ltv;"
   )
   private class590 field10981 = new class590(64);
   @OriginalMember(
      owner = "client!hb",
      name = "d",
      descriptor = "Lqh;"
   )
   private class74 field10983;
   @OriginalMember(
      owner = "client!hb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10993 = new String[]{method5465(method5464("\b)q]p")), method5465(method5464("\u001beq6%")), method5465(method5464("\u000e>3t")), method5465(method5464("\b)q$1\u000e\"+&p")), method5465(method5464("\b)q_p")), method5465(method5464("\b)q[p")), method5465(method5464("\b)q^p")), method5465(method5464("\b)qPp")), method5465(method5464("\b)qQp")), method5465(method5464("\b)q\\p")), method5465(method5464("\u0010#")), method5465(method5464("\b)qYp"))};
   @OriginalMember(
      owner = "client!hb",
      name = "j",
      descriptor = "J"
   )
   public static long field10985 = 0L;
   @OriginalMember(
      owner = "client!hb",
      name = "l",
      descriptor = "I"
   )
   public static int field10988 = 0;
   @OriginalMember(
      owner = "client!hb",
      name = "e",
      descriptor = "I"
   )
   public static int field10982;
   @OriginalMember(
      owner = "client!hb",
      name = "f",
      descriptor = "I"
   )
   public static int field10984;
   @OriginalMember(
      owner = "client!hb",
      name = "b",
      descriptor = "I"
   )
   public static int field10986;
   @OriginalMember(
      owner = "client!hb",
      name = "g",
      descriptor = "I"
   )
   public static int field10987;
   @OriginalMember(
      owner = "client!hb",
      name = "a",
      descriptor = "I"
   )
   public static int field10989;
   @OriginalMember(
      owner = "client!hb",
      name = "c",
      descriptor = "I"
   )
   public static int field10990;
   @OriginalMember(
      owner = "client!hb",
      name = "h",
      descriptor = "I"
   )
   public static int field10991;
   @OriginalMember(
      owner = "client!hb",
      name = "i",
      descriptor = "I"
   )
   public static int field10992;

   @OriginalMember(
      owner = "client!hb",
      name = "a",
      descriptor = "(III)Lec;"
   )
   public static final class247 method5455(int arg0, int arg1, int arg2) {
      class225 var3 = class111.field1404[arg0][arg1][arg2];
      if (var3 == null) {
         return null;
      } else {
         class247 var4 = var3.field2826;
         var3.field2826 = null;
         class726.method5282(var4);
         return var4;
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "a",
      descriptor = "(IIB)I"
   )
   public static final int method5456(int arg0, int arg1, byte arg2) {
      try {
         ++field10982;
         if (arg2 != 75) {
            method5461(30, -101);
         }

         if (~arg0 == 0) {
            return 12345678;
         } else {
            arg1 = (127 & arg0) * arg1 >> 7;
            if (~arg1 > -3) {
               arg1 = 2;
               if (!client.field4273) {
                  return (65408 & arg0) + arg1;
               }
            }

            if (arg1 > 126) {
               arg1 = 126;
            }

            return (65408 & arg0) + arg1;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field10993[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5457(int arg0) {
      try {
         ++field10989;
         class590 var2 = this.field10981;
         synchronized(this.field10981) {
            if (arg0 != 126) {
               field10988 = -109;
            }

            this.field10981.method4245(true);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10993[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method5458(byte arg0) {
      try {
         int var2 = 118 % ((arg0 - 43) / 51);
         ++field10990;
         class590 var3 = this.field10981;
         synchronized(this.field10981) {
            this.field10981.method4244(true);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field10993[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method5459(int arg0, int arg1) {
      try {
         class590 var3 = this.field10981;
         synchronized(this.field10981) {
            this.field10981.method4234(2, arg1);
            if (arg0 >= -91) {
               method5463(12, 11, 118);
            }
         }

         ++field10991;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field10993[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "c",
      descriptor = "(II)Lfja;"
   )
   public final class786 method5460(int arg0, int arg1) {
      try {
         ++field10984;
         class590 var3 = this.field10981;
         class786 var4;
         synchronized(this.field10981) {
            var4 = (class786)this.field10981.method4239((long)arg0, 0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class74 var5 = this.field10983;
            byte[] var6;
            synchronized(this.field10983) {
               var6 = this.field10983.method732(arg0, arg1, (byte)56);
            }

            class786 var7 = new class786();
            if (var6 != null) {
               var7.method5660(new class594(var6), 96);
            }

            class590 var8 = this.field10981;
            synchronized(this.field10981) {
               this.field10981.method4238(56, var7, (long)arg0);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field10993[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "b",
      descriptor = "(II)Lgda;"
   )
   public static final class60 method5461(int arg0, int arg1) {
      try {
         if (arg0 != 202) {
            method5455(-92, 33, 76);
         }

         ++field10986;
         return new class60(arg1, false);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field10993[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "a",
      descriptor = "(IIILjava/awt/Canvas;)Let;"
   )
   public static final class624 method5462(int arg0, int arg1, int arg2, Canvas arg3) {
      try {
         ++field10992;
         if (arg0 < 56) {
            field10985 = 58L;
         }

         try {
            Class var4 = Class.forName(field10993[10]);
            class624 var5 = (class624)var4.newInstance();
            var5.method1262(arg3, arg1, arg2, true);
            return var5;
         } catch (Throwable var8) {
            class153 var6 = new class153();
            var6.method1262(arg3, arg1, arg2, true);
            return var6;
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field10993[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10993[1] : field10993[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "b",
      descriptor = "(III)I"
   )
   public static final int method5463(int arg0, int arg1, int arg2) {
      try {
         label22: {
            arg0 = (127 & arg1) * arg0 >> 7;
            ++field10987;
            if (~arg0 <= -3) {
               if (arg0 <= 126) {
                  break label22;
               }

               arg0 = 126;
               if (!client.field4273) {
                  break label22;
               }
            }

            arg0 = 2;
         }

         if (arg2 != 12345678) {
            method5461(-47, -58);
         }

         return (arg1 & 65408) + arg0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field10993[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "<init>",
      descriptor = "(Lnc;ILqh;)V"
   )
   public class759(class26 arg0, int arg1, class74 arg2) {
      try {
         this.field10983 = arg2;
         if (this.field10983 != null) {
            this.field10983.method727(11, -32767);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10993[3] + (arg0 != null ? field10993[1] : field10993[2]) + ',' + arg1 + ',' + (arg2 != null ? field10993[1] : field10993[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5464(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5465(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 96;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 95;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
