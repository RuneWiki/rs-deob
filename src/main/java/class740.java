import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class740 extends class264 {
   @OriginalMember(
      owner = "client!mga",
      name = "O",
      descriptor = "I"
   )
   private int field10794 = -1;
   @OriginalMember(
      owner = "client!mga",
      name = "S",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10803 = new String[]{method5369(method5368("\u007fpi}S")), method5369(method5368("i9&}o,")), method5369(method5368("j++?")), method5369(method5368("i9&}i,")), method5369(method5368("i9&}\u007f,")), method5369(method5368("i9&}m,")), method5369(method5368("i9&}~,")), method5369(method5368("i9&}c,")), method5369(method5368("n?12\u0000h?)4\u0000v;!?Kg*i\u0012Mg;4 Gf2\"\u001cLn;$'")), method5369(method5368("j<&")), method5369(method5368("h1&7\u001e")), method5369(method5368("n?12\u0000h?)4\u0000W*5:@c")), method5369(method5368("i9&}j,")), method5369(method5368("n?12\u0000h?)4\u0000G2& ]")), method5369(method5368("w;3\u0012Mg;4 Gf2\"")), method5369(method5368("n?12\u0000h?)4\u0000V+)'Gi;"))};
   @OriginalMember(
      owner = "client!mga",
      name = "J",
      descriptor = "I"
   )
   public static int field10790;
   @OriginalMember(
      owner = "client!mga",
      name = "M",
      descriptor = "I"
   )
   public static int field10792;
   @OriginalMember(
      owner = "client!mga",
      name = "R",
      descriptor = "I"
   )
   private int field10793;
   @OriginalMember(
      owner = "client!mga",
      name = "H",
      descriptor = "I"
   )
   public static int field10796;
   @OriginalMember(
      owner = "client!mga",
      name = "L",
      descriptor = "I"
   )
   public static int field10797;
   @OriginalMember(
      owner = "client!mga",
      name = "N",
      descriptor = "I"
   )
   public static int field10798;
   @OriginalMember(
      owner = "client!mga",
      name = "I",
      descriptor = "I"
   )
   public static int field10799;
   @OriginalMember(
      owner = "client!mga",
      name = "F",
      descriptor = "I"
   )
   public static int field10800;
   @OriginalMember(
      owner = "client!mga",
      name = "P",
      descriptor = "I"
   )
   private int field10801;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!mga",
      name = "K",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field10802;
   @OriginalMember(
      owner = "client!mga",
      name = "G",
      descriptor = "[I"
   )
   private int[] field10791;
   @OriginalMember(
      owner = "client!mga",
      name = "Q",
      descriptor = "[Lnka;"
   )
   public static class311[] field10795;

   @OriginalMember(
      owner = "client!mga",
      name = "c",
      descriptor = "(IBI)V"
   )
   public final void method2016(int arg0, byte arg1, int arg2) {
      try {
         super.method2016(arg0, arg1, arg2);
         ++field10798;
         if (~this.field10794 <= -1 && class350.field4713 != null) {
            int var4 = !class350.field4713.method1354(this.field10794, (byte)-109).field4318 ? 128 : 64;
            this.field10791 = class350.field4713.method1350(1.0F, this.field10794, var4, var4, (byte)123, false);
            this.field10801 = var4;
            this.field10793 = var4;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10803[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "<init>",
      descriptor = "()V"
   )
   public class740() {
      super(0, false);
   }

   @OriginalMember(
      owner = "client!mga",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method379(int arg0) {
      try {
         if (arg0 < 117) {
            this.method379(23);
         }

         super.method379(126);
         ++field10796;
         this.field10791 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10803[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "(ILwf;I)V"
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      try {
         if (arg2 <= 49) {
            this.method2014((byte)112);
         }

         if (~arg0 == -1) {
            this.field10794 = arg1.method1211(-26166);
         }

         ++field10790;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10803[1] + arg0 + ',' + (arg1 != null ? field10803[0] : field10803[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method4(int arg0, byte arg1) {
      boolean var3 = client.field4360;

      try {
         ++field10797;
         int[][] var4 = super.field3634.method4362((byte)116, arg0);
         if (arg1 > -117) {
            return null;
         } else {
            if (super.field3634.field8828) {
               int var5 = this.field10801 * (~class20.field234 != ~this.field10793 ? this.field10793 * arg0 / class20.field234 : arg0);
               int[] var6 = var4[0];
               int[] var7 = var4[1];
               int[] var8 = var4[2];
               if (class430.field6152 == this.field10801) {
                  int var9 = 0;
                  if (var3 || class430.field6152 > var9) {
                     do {
                        int var10 = this.field10791[var5++];
                        var8[var9] = class556.method3988(var10 << 4, 4080);
                        var7[var9] = class556.method3988(var10, 65280) >> 4;
                        var6[var9] = class556.method3988(4080, var10 >> 12);
                        ++var9;
                     } while(class430.field6152 > var9);
                  }

                  if (!var3) {
                     return var4;
                  }
               }

               int var11 = 0;
               if (var3 || var11 < class430.field6152) {
                  do {
                     int var12 = this.field10801 * var11 / class430.field6152;
                     int var13 = this.field10791[var5 + var12];
                     var8[var11] = class556.method3988(var13, 255) << 4;
                     var7[var11] = class556.method3988(65280, var13) >> 4;
                     var6[var11] = class556.method3988(var13, 16711680) >> 12;
                     ++var11;
                  } while(var11 < class430.field6152);
               }
            }

            return var4;
         }
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field10803[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method5365(int arg0) {
      try {
         field10795 = null;
         if (arg0 != -17006) {
            method5366((String)null, -128, (Class)null);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10803[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Z"
   )
   public static final boolean method5366(String arg0, int arg1, Class arg2) {
      try {
         if (arg1 != -15717) {
            return true;
         } else {
            ++field10800;
            Class var3 = (Class)class60.field741.get(arg0);
            if (var3 != null) {
               return var3.getClassLoader() == arg2.getClassLoader();
            } else {
               File var4 = null;
               if (var4 == null) {
                  var4 = (File)class641.field9377.get(arg0);
               }

               if (var4 != null) {
                  try {
                     var4 = new File(var4.getCanonicalPath());
                     Class var5 = Class.forName(field10803[15]);
                     Class var6 = Class.forName(field10803[8]);
                     Method var7 = var6.getDeclaredMethod(field10803[14], Boolean.TYPE);
                     Method var8 = var5.getDeclaredMethod(field10803[10], Class.forName(field10803[13]), Class.forName(field10803[11]));
                     var7.invoke(var8, Boolean.TRUE);
                     var8.invoke(Runtime.getRuntime(), arg2, var4.getPath());
                     var7.invoke(var8, Boolean.FALSE);
                     class60.field741.put(arg0, arg2);
                     return true;
                  } catch (NoSuchMethodException var10) {
                     System.load(var4.getPath());
                     class60.field741.put(arg0, field10802 != null ? field10802 : (field10802 = method5367(field10803[9])));
                     return true;
                  } catch (Throwable var11) {
                  }
               }

               return false;
            }
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field10803[12] + (arg0 != null ? field10803[0] : field10803[2]) + ',' + arg1 + ',' + (arg2 != null ? field10803[0] : field10803[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method2014(byte arg0) {
      try {
         int var2 = -121 % ((arg0 - 36) / 41);
         ++field10799;
         return this.field10794;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10803[6] + arg0 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method5367(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5368(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5369(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
