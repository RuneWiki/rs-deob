package deob;

@ObfuscatedName("UTWNPFGW")
public class UTWNPFGW {

	@ObfuscatedName("UTWNPFGW.g")
	public int field1293 = 0;

	@ObfuscatedName("UTWNPFGW.h")
	public int field1294 = 0;

	@ObfuscatedName("UTWNPFGW.i")
	public int field1295;

	@ObfuscatedName("UTWNPFGW.j")
	public int field1296;

	@ObfuscatedName("UTWNPFGW.k")
	public int[][] field1297;

	public UTWNPFGW(int arg0, int arg1) {
		field1295 = arg0;
		field1296 = arg1;
		field1297 = new int[field1295][field1296];
		method484();
	}

	@ObfuscatedName("UTWNPFGW.a(I)V")
	public void method484() {
		for (int var1 = 0; var1 < field1295; var1++) {
			for (int var2 = 0; var2 < field1296; var2++) {
				if (var1 == 0 || var2 == 0 || field1295 - 1 == var1 || field1296 - 1 == var2) {
					field1297[var1][var2] = 0xFFFFFF;
				} else {
					field1297[var1][var2] = 0;
				}
			}
		}
	}

	@ObfuscatedName("UTWNPFGW.a(ZIIBII)V")
	public void method485(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg2 -= field1293;
		arg3 -= field1294;
		if (arg4 == 0) {
			if (arg1 == 0) {
				method488(arg2, arg3, 128);
				method488(arg2 - 1, arg3, 8);
			}

			if (arg1 == 1) {
				method488(arg2, arg3, 2);
				method488(arg2, arg3 + 1, 32);
			}

			if (arg1 == 2) {
				method488(arg2, arg3, 8);
				method488(arg2 + 1, arg3, 128);
			}

			if (arg1 == 3) {
				method488(arg2, arg3, 32);
				method488(arg2, arg3 - 1, 2);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				method488(arg2, arg3, 1);
				method488(arg2 - 1, arg3 + 1, 16);
			}

			if (arg1 == 1) {
				method488(arg2, arg3, 4);
				method488(arg2 + 1, arg3 + 1, 64);
			}

			if (arg1 == 2) {
				method488(arg2, arg3, 16);
				method488(arg2 + 1, arg3 - 1, 1);
			}

			if (arg1 == 3) {
				method488(arg2, arg3, 64);
				method488(arg2 - 1, arg3 - 1, 4);
			}
		}

		if (arg4 == 2) {
			if (arg1 == 0) {
				method488(arg2, arg3, 130);
				method488(arg2 - 1, arg3, 8);
				method488(arg2, arg3 + 1, 32);
			}

			if (arg1 == 1) {
				method488(arg2, arg3, 10);
				method488(arg2, arg3 + 1, 32);
				method488(arg2 + 1, arg3, 128);
			}

			if (arg1 == 2) {
				method488(arg2, arg3, 40);
				method488(arg2 + 1, arg3, 128);
				method488(arg2, arg3 - 1, 2);
			}

			if (arg1 == 3) {
				method488(arg2, arg3, 160);
				method488(arg2, arg3 - 1, 2);
				method488(arg2 - 1, arg3, 8);
			}
		}

		if (arg0) {
			if (arg4 == 0) {
				if (arg1 == 0) {
					method488(arg2, arg3, 0x10000);
					method488(arg2 - 1, arg3, 4096);
				}

				if (arg1 == 1) {
					method488(arg2, arg3, 1024);
					method488(arg2, arg3 + 1, 16384);
				}

				if (arg1 == 2) {
					method488(arg2, arg3, 4096);
					method488(arg2 + 1, arg3, 0x10000);
				}

				if (arg1 == 3) {
					method488(arg2, arg3, 16384);
					method488(arg2, arg3 - 1, 1024);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg1 == 0) {
					method488(arg2, arg3, 512);
					method488(arg2 - 1, arg3 + 1, 8192);
				}

				if (arg1 == 1) {
					method488(arg2, arg3, 2048);
					method488(arg2 + 1, arg3 + 1, 32768);
				}

				if (arg1 == 2) {
					method488(arg2, arg3, 8192);
					method488(arg2 + 1, arg3 - 1, 512);
				}

				if (arg1 == 3) {
					method488(arg2, arg3, 32768);
					method488(arg2 - 1, arg3 - 1, 2048);
				}
			}

			if (arg4 == 2) {
				if (arg1 == 0) {
					method488(arg2, arg3, 66560);
					method488(arg2 - 1, arg3, 4096);
					method488(arg2, arg3 + 1, 16384);
				}

				if (arg1 == 1) {
					method488(arg2, arg3, 5120);
					method488(arg2, arg3 + 1, 16384);
					method488(arg2 + 1, arg3, 0x10000);
				}

				if (arg1 == 2) {
					method488(arg2, arg3, 20480);
					method488(arg2 + 1, arg3, 0x10000);
					method488(arg2, arg3 - 1, 1024);
				}

				if (arg1 == 3) {
					method488(arg2, arg3, 81920);
					method488(arg2, arg3 - 1, 1024);
					method488(arg2 - 1, arg3, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("UTWNPFGW.a(IIIIIZI)V")
	public void method486(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg1 -= field1293;
		arg5 -= field1294;

		if (arg0 == 1 || arg0 == 3) {
			int var8 = arg2;
			arg2 = arg3;
			arg3 = var8;
		}

		for (int var9 = arg1; var9 < arg1 + arg2; var9++) {
			if (var9 >= 0 && var9 < field1295) {
				for (int var10 = arg5; var10 < arg3 + arg5; var10++) {
					if (var10 >= 0 && var10 < field1296) {
						method488(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("UTWNPFGW.a(III)V")
	public void method487(int arg0, int arg1) {
		arg0 -= field1293;
		arg1 -= field1294;
		field1297[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("UTWNPFGW.b(III)V")
	public void method488(int arg0, int arg1, int arg2) {
		field1297[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("UTWNPFGW.a(ZIZIII)V")
	public void method489(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg2 -= field1293;
		arg3 -= field1294;
		if (arg4 == 0) {
			if (arg0 == 0) {
				method491(arg3, 128, arg2);
				method491(arg3, 8, arg2 - 1);
			}

			if (arg0 == 1) {
				method491(arg3, 2, arg2);
				method491(arg3 + 1, 32, arg2);
			}

			if (arg0 == 2) {
				method491(arg3, 8, arg2);
				method491(arg3, 128, arg2 + 1);
			}

			if (arg0 == 3) {
				method491(arg3, 32, arg2);
				method491(arg3 - 1, 2, arg2);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				method491(arg3, 1, arg2);
				method491(arg3 + 1, 16, arg2 - 1);
			}

			if (arg0 == 1) {
				method491(arg3, 4, arg2);
				method491(arg3 + 1, 64, arg2 + 1);
			}

			if (arg0 == 2) {
				method491(arg3, 16, arg2);
				method491(arg3 - 1, 1, arg2 + 1);
			}

			if (arg0 == 3) {
				method491(arg3, 64, arg2);
				method491(arg3 - 1, 4, arg2 - 1);
			}
		}

		if (arg4 == 2) {
			if (arg0 == 0) {
				method491(arg3, 130, arg2);
				method491(arg3, 8, arg2 - 1);
				method491(arg3 + 1, 32, arg2);
			}

			if (arg0 == 1) {
				method491(arg3, 10, arg2);
				method491(arg3 + 1, 32, arg2);
				method491(arg3, 128, arg2 + 1);
			}

			if (arg0 == 2) {
				method491(arg3, 40, arg2);
				method491(arg3, 128, arg2 + 1);
				method491(arg3 - 1, 2, arg2);
			}

			if (arg0 == 3) {
				method491(arg3, 160, arg2);
				method491(arg3 - 1, 2, arg2);
				method491(arg3, 8, arg2 - 1);
			}
		}

		if (arg1) {
			if (arg4 == 0) {
				if (arg0 == 0) {
					method491(arg3, 0x10000, arg2);
					method491(arg3, 4096, arg2 - 1);
				}

				if (arg0 == 1) {
					method491(arg3, 1024, arg2);
					method491(arg3 + 1, 16384, arg2);
				}

				if (arg0 == 2) {
					method491(arg3, 4096, arg2);
					method491(arg3, 0x10000, arg2 + 1);
				}

				if (arg0 == 3) {
					method491(arg3, 16384, arg2);
					method491(arg3 - 1, 1024, arg2);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					method491(arg3, 512, arg2);
					method491(arg3 + 1, 8192, arg2 - 1);
				}

				if (arg0 == 1) {
					method491(arg3, 2048, arg2);
					method491(arg3 + 1, 32768, arg2 + 1);
				}

				if (arg0 == 2) {
					method491(arg3, 8192, arg2);
					method491(arg3 - 1, 512, arg2 + 1);
				}

				if (arg0 == 3) {
					method491(arg3, 32768, arg2);
					method491(arg3 - 1, 2048, arg2 - 1);
				}
			}

			if (arg4 == 2) {
				if (arg0 == 0) {
					method491(arg3, 66560, arg2);
					method491(arg3, 4096, arg2 - 1);
					method491(arg3 + 1, 16384, arg2);
				}

				if (arg0 == 1) {
					method491(arg3, 5120, arg2);
					method491(arg3 + 1, 16384, arg2);
					method491(arg3, 0x10000, arg2 + 1);
				}

				if (arg0 == 2) {
					method491(arg3, 20480, arg2);
					method491(arg3, 0x10000, arg2 + 1);
					method491(arg3 - 1, 1024, arg2);
				}

				if (arg0 == 3) {
					method491(arg3, 81920, arg2);
					method491(arg3 - 1, 1024, arg2);
					method491(arg3, 4096, arg2 - 1);
					return;
				}
			}
		}
	}

	@ObfuscatedName("UTWNPFGW.b(IIIIIZI)V")
	public void method490(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg1 -= field1293;
		arg5 -= field1294;

		if (arg0 == 1 || arg0 == 3) {
			int var8 = arg3;
			arg3 = arg2;
			arg2 = var8;
		}

		for (int var9 = arg1; var9 < arg1 + arg3; var9++) {
			if (var9 >= 0 && var9 < field1295) {
				for (int var10 = arg5; var10 < arg2 + arg5; var10++) {
					if (var10 >= 0 && var10 < field1296) {
						method491(var10, var7, var9);
					}
				}
			}
		}
	}

	@ObfuscatedName("UTWNPFGW.a(IIII)V")
	public void method491(int arg0, int arg1, int arg2) {
		field1297[arg2][arg0] &= 0xFFFFFF - arg1;
	}

	@ObfuscatedName("UTWNPFGW.a(ZII)V")
	public void method492(int arg0, int arg1) {
		arg1 -= field1293;
		arg0 -= field1294;
		field1297[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("UTWNPFGW.a(IIIIIII)Z")
	public boolean method493(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 == arg4 && arg0 == arg1) {
			return true;
		}

		arg2 -= field1293;
		arg1 -= field1294;
		arg4 -= field1293;
		arg0 -= field1294;
		if (arg3 == 0) {
			if (arg5 == 0) {
				if (arg4 - 1 == arg2 && arg0 == arg1) {
					return true;
				}

				if (arg2 == arg4 && arg0 + 1 == arg1 && (field1297[arg2][arg1] & 0x280120) == 0) {
					return true;
				}

				if (arg2 == arg4 && arg0 - 1 == arg1 && (field1297[arg2][arg1] & 0x280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg2 == arg4 && arg0 + 1 == arg1) {
					return true;
				}

				if (arg4 - 1 == arg2 && arg0 == arg1 && (field1297[arg2][arg1] & 0x280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg2 && arg0 == arg1 && (field1297[arg2][arg1] & 0x280180) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg4 + 1 == arg2 && arg0 == arg1) {
					return true;
				}

				if (arg2 == arg4 && arg0 + 1 == arg1 && (field1297[arg2][arg1] & 0x280120) == 0) {
					return true;
				}

				if (arg2 == arg4 && arg0 - 1 == arg1 && (field1297[arg2][arg1] & 0x280102) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg2 == arg4 && arg0 - 1 == arg1) {
					return true;
				}

				if (arg4 - 1 == arg2 && arg0 == arg1 && (field1297[arg2][arg1] & 0x280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg2 && arg0 == arg1 && (field1297[arg2][arg1] & 0x280180) == 0) {
					return true;
				}
			}
		}

		if (arg3 == 2) {
			if (arg5 == 0) {
				if (arg4 - 1 == arg2 && arg0 == arg1) {
					return true;
				}

				if (arg2 == arg4 && arg0 + 1 == arg1) {
					return true;
				}

				if (arg4 + 1 == arg2 && arg0 == arg1 && (field1297[arg2][arg1] & 0x280180) == 0) {
					return true;
				}

				if (arg2 == arg4 && arg0 - 1 == arg1 && (field1297[arg2][arg1] & 0x280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg4 - 1 == arg2 && arg0 == arg1 && (field1297[arg2][arg1] & 0x280108) == 0) {
					return true;
				}

				if (arg2 == arg4 && arg0 + 1 == arg1) {
					return true;
				}

				if (arg4 + 1 == arg2 && arg0 == arg1) {
					return true;
				}

				if (arg2 == arg4 && arg0 - 1 == arg1 && (field1297[arg2][arg1] & 0x280102) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg4 - 1 == arg2 && arg0 == arg1 && (field1297[arg2][arg1] & 0x280108) == 0) {
					return true;
				}

				if (arg2 == arg4 && arg0 + 1 == arg1 && (field1297[arg2][arg1] & 0x280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg2 && arg0 == arg1) {
					return true;
				}

				if (arg2 == arg4 && arg0 - 1 == arg1) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg4 - 1 == arg2 && arg0 == arg1) {
					return true;
				}

				if (arg2 == arg4 && arg0 + 1 == arg1 && (field1297[arg2][arg1] & 0x280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg2 && arg0 == arg1 && (field1297[arg2][arg1] & 0x280180) == 0) {
					return true;
				}

				if (arg2 == arg4 && arg0 - 1 == arg1) {
					return true;
				}
			}
		}

		if (arg3 == 9) {
			if (arg2 == arg4 && arg0 + 1 == arg1 && (field1297[arg2][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg2 == arg4 && arg0 - 1 == arg1 && (field1297[arg2][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg4 - 1 == arg2 && arg0 == arg1 && (field1297[arg2][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg4 + 1 == arg2 && arg0 == arg1 && (field1297[arg2][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("UTWNPFGW.b(IIIIIII)Z")
	public boolean method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 == arg5 && arg1 == arg2) {
			return true;
		}

		arg3 -= field1293;
		arg1 -= field1294;
		arg5 -= field1293;
		arg2 -= field1294;
		if (arg4 == 6 || arg4 == 7) {
			if (arg4 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}

			if (arg0 == 0) {
				if (arg5 + 1 == arg3 && arg1 == arg2 && (field1297[arg3][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg2 - 1 == arg1 && (field1297[arg3][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg5 - 1 == arg3 && arg1 == arg2 && (field1297[arg3][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg2 - 1 == arg1 && (field1297[arg3][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg5 - 1 == arg3 && arg1 == arg2 && (field1297[arg3][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg2 + 1 == arg1 && (field1297[arg3][arg1] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg5 + 1 == arg3 && arg1 == arg2 && (field1297[arg3][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg2 + 1 == arg1 && (field1297[arg3][arg1] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 8) {
			if (arg3 == arg5 && arg2 + 1 == arg1 && (field1297[arg3][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg3 == arg5 && arg2 - 1 == arg1 && (field1297[arg3][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg5 - 1 == arg3 && arg1 == arg2 && (field1297[arg3][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg5 + 1 == arg3 && arg1 == arg2 && (field1297[arg3][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("UTWNPFGW.a(IIIIIIII)Z")
	public boolean method495(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg2 + arg4 - 1;
		int var9 = arg3 + arg5 - 1;
		if (arg1 >= arg2 && arg1 <= var8 && arg0 >= arg3 && arg0 <= var9) {
			return true;
		}

		if (arg2 - 1 == arg1 && arg0 >= arg3 && arg0 <= var9 && (field1297[arg1 - field1293][arg0 - field1294] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg1 && arg0 >= arg3 && arg0 <= var9 && (field1297[arg1 - field1293][arg0 - field1294] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		}

		if (arg3 - 1 == arg0 && arg1 >= arg2 && arg1 <= var8 && (field1297[arg1 - field1293][arg0 - field1294] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg0 && arg1 >= arg2 && arg1 <= var8 && (field1297[arg1 - field1293][arg0 - field1294] & 0x20) == 0 && (arg6 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
