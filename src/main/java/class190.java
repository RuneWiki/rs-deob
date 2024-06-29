import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class190 extends class246 {
   @OriginalMember(
      owner = "client!cw",
      name = "z",
      descriptor = "Z"
   )
   public boolean field2861 = false;
   @OriginalMember(
      owner = "client!cw",
      name = "m",
      descriptor = "I"
   )
   private int field2863 = 0;
   @OriginalMember(
      owner = "client!cw",
      name = "C",
      descriptor = "Ljn;"
   )
   public class748 field2850 = new class748();
   @OriginalMember(
      owner = "client!cw",
      name = "k",
      descriptor = "Ljn;"
   )
   private class748 field2864 = new class748();
   @OriginalMember(
      owner = "client!cw",
      name = "q",
      descriptor = "Z"
   )
   private boolean field2865 = false;
   @OriginalMember(
      owner = "client!cw",
      name = "J",
      descriptor = "Ltf;"
   )
   public class309 field2858;
   @OriginalMember(
      owner = "client!cw",
      name = "l",
      descriptor = "Lpja;"
   )
   public class42 field2854;
   @OriginalMember(
      owner = "client!cw",
      name = "E",
      descriptor = "J"
   )
   private long field2859;
   @OriginalMember(
      owner = "client!cw",
      name = "H",
      descriptor = "Lbia;"
   )
   public class522 field2857;
   @OriginalMember(
      owner = "client!cw",
      name = "D",
      descriptor = "Lhc;"
   )
   public class150 field2848;
   @OriginalMember(
      owner = "client!cw",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2873 = new String[]{method1661(method1660("4\u007faz\u001d")), method1661(method1660("4\u007fa{\u001d")), method1661(method1660(",&a\u0012H")), method1661(method1660("9}#P")), method1661(method1660("4\u007fax\u001d")), method1661(method1660("4\u007fa\u007f\u001d")), method1661(method1660("4\u007fa~\u001d")), method1661(method1660("4\u007fa}\u001d")), method1661(method1660("4\u007fay\u001d")), method1661(method1660("4\u007fa\u0000\\9a;\u0002\u001d"))};
   @OriginalMember(
      owner = "client!cw",
      name = "u",
      descriptor = "[I"
   )
   public static int[] field2851 = new int[]{4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1};
   @OriginalMember(
      owner = "client!cw",
      name = "v",
      descriptor = "I"
   )
   public static int field2847 = -1;
   @OriginalMember(
      owner = "client!cw",
      name = "n",
      descriptor = "I"
   )
   public static int field2846;
   @OriginalMember(
      owner = "client!cw",
      name = "o",
      descriptor = "I"
   )
   public int field2849;
   @OriginalMember(
      owner = "client!cw",
      name = "B",
      descriptor = "I"
   )
   public static int field2853;
   @OriginalMember(
      owner = "client!cw",
      name = "s",
      descriptor = "I"
   )
   public static int field2855;
   @OriginalMember(
      owner = "client!cw",
      name = "x",
      descriptor = "I"
   )
   public static int field2856;
   @OriginalMember(
      owner = "client!cw",
      name = "I",
      descriptor = "I"
   )
   public static int field2860;
   @OriginalMember(
      owner = "client!cw",
      name = "A",
      descriptor = "I"
   )
   public static int field2862;
   @OriginalMember(
      owner = "client!cw",
      name = "F",
      descriptor = "I"
   )
   private int field2866;
   @OriginalMember(
      owner = "client!cw",
      name = "p",
      descriptor = "I"
   )
   private int field2867;
   @OriginalMember(
      owner = "client!cw",
      name = "t",
      descriptor = "I"
   )
   private int field2868;
   @OriginalMember(
      owner = "client!cw",
      name = "w",
      descriptor = "I"
   )
   private int field2869;
   @OriginalMember(
      owner = "client!cw",
      name = "j",
      descriptor = "I"
   )
   private int field2870;
   @OriginalMember(
      owner = "client!cw",
      name = "y",
      descriptor = "I"
   )
   private int field2871;
   @OriginalMember(
      owner = "client!cw",
      name = "G",
      descriptor = "I"
   )
   private int field2872;
   @OriginalMember(
      owner = "client!cw",
      name = "r",
      descriptor = "Lria;"
   )
   public static class299 field2852;

   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "(JZLha;)V"
   )
   public final void method1653(long arg0, boolean arg1, class65 arg2) {
      boolean var5 = client.field4564;

      try {
         ++field2860;
         class99 var6 = (class99)this.field2848.method1394((byte)-118);
         if (var5) {
            var6.method955(arg2, arg0);
            var6 = (class99)this.field2848.method1400(!arg1);
         }

         while(true) {
            if (var6 == null) {
               if (!var5) {
                  if (!arg1) {
                     method1655(103, -89, (byte)84);
                     return;
                  }

                  return;
               }
            } else {
               var6.method955(arg2, arg0);
            }

            var6 = (class99)this.field2848.method1400(!arg1);
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field2873[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2873[2] : field2873[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "(Lha;ZIBJ)V"
   )
   public final void method1654(class65 param1, boolean param2, int param3, byte param4, long param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method1655(int arg0, int arg1, byte arg2) {
      try {
         if (arg2 != 62) {
            return true;
         } else {
            ++field2855;
            return ~(540800 & arg0) != -1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2873[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "(BZI)Lpba;"
   )
   public static final class349 method1656(byte arg0, boolean arg1, int arg2) {
      try {
         ++field2853;
         if (arg0 <= 33) {
            method1657(28, -74, true);
         }

         long var3 = (long)(arg2 | (arg1 ? Integer.MIN_VALUE : 0));
         return (class349)class310.field4469.method1572(var3, -16289);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2873[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "(IIZ)V"
   )
   public static final void method1657(int arg0, int arg1, boolean arg2) {
      boolean var3 = client.field4564;

      try {
         label32: {
            ++field2856;
            if (class680.field9971 != 1) {
               if (~class680.field9971 != -3) {
                  break label32;
               }

               if (!class262.field3734) {
                  class524.method3940(arg0, arg1, 2);
                  if (!var3) {
                     break label32;
                  }
               }

               class524.method3940(class745.method5410(-53) + arg0, class124.method1174((byte)-114) + arg1, 2);
               if (!var3) {
                  break label32;
               }
            }

            class26.method182(-2, arg0, class518.field7524, arg1);
         }

         class518.field7524 = null;
         class680.field9971 = 0;
         if (arg2) {
            field2851 = null;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2873[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1658(int arg0) {
      try {
         this.field2850.field10788 = this.field2858.field4452;
         this.field2850.field10782 = this.field2858.field4453;
         this.field2850.field10783 = this.field2858.field4450;
         if (arg0 != 0) {
            this.field2857 = null;
         }

         this.field2850.field10780 = this.field2858.field4454;
         this.field2850.field10789 = this.field2858.field4447;
         this.field2850.field10784 = this.field2858.field4449;
         this.field2850.field10781 = this.field2858.field4442;
         ++field2862;
         this.field2850.field10786 = this.field2858.field4444;
         this.field2850.field10790 = this.field2858.field4458;
         if (this.field2850.field10786 == this.field2850.field10780 && this.field2850.field10789 == this.field2850.field10786 && this.field2850.field10788 == this.field2850.field10783 && ~this.field2850.field10790 == ~this.field2850.field10783 && this.field2850.field10782 == this.field2850.field10781 && ~this.field2850.field10784 == ~this.field2850.field10782) {
            this.field2865 = true;
         } else if (this.field2865) {
            this.field2865 = false;
            this.field2864.field10788 = this.field2850.field10788;
            this.field2864.field10784 = this.field2850.field10784;
            this.field2864.field10783 = this.field2850.field10783;
            this.field2864.field10780 = this.field2850.field10780;
            this.field2864.field10781 = this.field2850.field10781;
            this.field2864.field10782 = this.field2850.field10782;
            this.field2864.field10789 = this.field2850.field10789;
            this.field2864.field10786 = this.field2850.field10786;
            this.field2864.field10790 = this.field2850.field10790;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2873[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1659(byte arg0) {
      try {
         if (arg0 >= -62) {
            method1656((byte)46, true, 27);
         }

         field2852 = null;
         field2851 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2873[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "<init>",
      descriptor = "(Lha;Ltf;Lpja;J)V"
   )
   public class190(class65 arg0, class309 arg1, class42 arg2, long arg3) {
      try {
         this.field2858 = arg1;
         this.field2854 = arg2;
         this.field2859 = arg3;
         this.field2857 = this.field2858.method2412(-88);
         if (!arg0.method327() && this.field2857.field7602 != -1) {
            this.field2857 = class431.method3248(-43, this.field2857.field7602);
         }

         this.field2848 = new class150();
         this.field2863 = (int)((double)this.field2863 + Math.random() * 64.0D);
         this.method1658(0);
         this.field2864.field10788 = this.field2850.field10788;
         this.field2864.field10790 = this.field2850.field10790;
         this.field2864.field10780 = this.field2850.field10780;
         this.field2864.field10781 = this.field2850.field10781;
         this.field2864.field10786 = this.field2850.field10786;
         this.field2864.field10789 = this.field2850.field10789;
         this.field2864.field10783 = this.field2850.field10783;
         this.field2864.field10782 = this.field2850.field10782;
         this.field2864.field10784 = this.field2850.field10784;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field2873[9] + (arg0 != null ? field2873[2] : field2873[3]) + ',' + (arg1 != null ? field2873[2] : field2873[3]) + ',' + (arg2 != null ? field2873[2] : field2873[3]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1660(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1661(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 87;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 60;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
