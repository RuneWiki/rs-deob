package deob;

@ObfuscatedName("KQTHKTBC")
public class KQTHKTBC {

	@ObfuscatedName("KQTHKTBC.f")
	public int field793 = 0;

	@ObfuscatedName("KQTHKTBC.g")
	public int field794 = 0;

	@ObfuscatedName("KQTHKTBC.h")
	public int field795;

	@ObfuscatedName("KQTHKTBC.i")
	public int field796;

	@ObfuscatedName("KQTHKTBC.j")
	public int[][] field797;

	public KQTHKTBC(int arg0, int arg1) {
		field795 = arg1;
		field796 = arg0;
		field797 = new int[field795][field796];
		method283();
	}

	@ObfuscatedName("KQTHKTBC.a()V")
	public void method283() {
		for (int var1 = 0; var1 < field795; var1++) {
			for (int var2 = 0; var2 < field796; var2++) {
				if (var1 == 0 || var2 == 0 || field795 - 1 == var1 || field796 - 1 == var2) {
					field797[var1][var2] = 0xFFFFFF;
				} else {
					field797[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("KQTHKTBC.a(IBIZII)V")
	public void method284(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg1 -= field793;
		arg3 -= field794;
		if (arg0 == 0) {
			if (arg4 == 0) {
				method287(arg1, arg3, 128);
				method287(arg1 - 1, arg3, 8);
			}

			if (arg4 == 1) {
				method287(arg1, arg3, 2);
				method287(arg1, arg3 + 1, 32);
			}

			if (arg4 == 2) {
				method287(arg1, arg3, 8);
				method287(arg1 + 1, arg3, 128);
			}

			if (arg4 == 3) {
				method287(arg1, arg3, 32);
				method287(arg1, arg3 - 1, 2);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				method287(arg1, arg3, 1);
				method287(arg1 - 1, arg3 + 1, 16);
			}

			if (arg4 == 1) {
				method287(arg1, arg3, 4);
				method287(arg1 + 1, arg3 + 1, 64);
			}

			if (arg4 == 2) {
				method287(arg1, arg3, 16);
				method287(arg1 + 1, arg3 - 1, 1);
			}

			if (arg4 == 3) {
				method287(arg1, arg3, 64);
				method287(arg1 - 1, arg3 - 1, 4);
			}
		}

		if (arg0 == 2) {
			if (arg4 == 0) {
				method287(arg1, arg3, 130);
				method287(arg1 - 1, arg3, 8);
				method287(arg1, arg3 + 1, 32);
			}

			if (arg4 == 1) {
				method287(arg1, arg3, 10);
				method287(arg1, arg3 + 1, 32);
				method287(arg1 + 1, arg3, 128);
			}

			if (arg4 == 2) {
				method287(arg1, arg3, 40);
				method287(arg1 + 1, arg3, 128);
				method287(arg1, arg3 - 1, 2);
			}

			if (arg4 == 3) {
				method287(arg1, arg3, 160);
				method287(arg1, arg3 - 1, 2);
				method287(arg1 - 1, arg3, 8);
			}
		}

		if (arg2) {
			if (arg0 == 0) {
				if (arg4 == 0) {
					method287(arg1, arg3, 0x10000);
					method287(arg1 - 1, arg3, 4096);
				}

				if (arg4 == 1) {
					method287(arg1, arg3, 1024);
					method287(arg1, arg3 + 1, 16384);
				}

				if (arg4 == 2) {
					method287(arg1, arg3, 4096);
					method287(arg1 + 1, arg3, 0x10000);
				}

				if (arg4 == 3) {
					method287(arg1, arg3, 16384);
					method287(arg1, arg3 - 1, 1024);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg4 == 0) {
					method287(arg1, arg3, 512);
					method287(arg1 - 1, arg3 + 1, 8192);
				}

				if (arg4 == 1) {
					method287(arg1, arg3, 2048);
					method287(arg1 + 1, arg3 + 1, 32768);
				}

				if (arg4 == 2) {
					method287(arg1, arg3, 8192);
					method287(arg1 + 1, arg3 - 1, 512);
				}

				if (arg4 == 3) {
					method287(arg1, arg3, 32768);
					method287(arg1 - 1, arg3 - 1, 2048);
				}
			}

			if (arg0 == 2) {
				if (arg4 == 0) {
					method287(arg1, arg3, 66560);
					method287(arg1 - 1, arg3, 4096);
					method287(arg1, arg3 + 1, 16384);
				}

				if (arg4 == 1) {
					method287(arg1, arg3, 5120);
					method287(arg1, arg3 + 1, 16384);
					method287(arg1 + 1, arg3, 0x10000);
				}

				if (arg4 == 2) {
					method287(arg1, arg3, 20480);
					method287(arg1 + 1, arg3, 0x10000);
					method287(arg1, arg3 - 1, 1024);
				}

				if (arg4 == 3) {
					method287(arg1, arg3, 81920);
					method287(arg1, arg3 - 1, 1024);
					method287(arg1 - 1, arg3, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("KQTHKTBC.a(IIIZIII)V")
	public void method285(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg3) {
			var7 += 0x20000;
		}

		arg4 -= field793;
		arg0 -= field794;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg5;
			arg5 = arg1;
			arg1 = var8;
		}

		for (int var9 = arg4; var9 < arg4 + arg5; var9++) {
			if (var9 >= 0 && var9 < field795) {
				for (int var10 = arg0; var10 < arg0 + arg1; var10++) {
					if (var10 >= 0 && var10 < field796) {
						method287(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("KQTHKTBC.a(III)V")
	public void method286(int arg0, int arg1) {
		arg1 -= field793;
		arg0 -= field794;
		field797[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("KQTHKTBC.b(III)V")
	public void method287(int arg0, int arg1, int arg2) {
		field797[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("KQTHKTBC.a(IZIIII)V")
	public void method288(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg3 -= field793;
		arg2 -= field794;
		if (arg0 == 0) {
			if (arg4 == 0) {
				method290(arg3, 128, arg2);
				method290(arg3 - 1, 8, arg2);
			}

			if (arg4 == 1) {
				method290(arg3, 2, arg2);
				method290(arg3, 32, arg2 + 1);
			}

			if (arg4 == 2) {
				method290(arg3, 8, arg2);
				method290(arg3 + 1, 128, arg2);
			}

			if (arg4 == 3) {
				method290(arg3, 32, arg2);
				method290(arg3, 2, arg2 - 1);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				method290(arg3, 1, arg2);
				method290(arg3 - 1, 16, arg2 + 1);
			}

			if (arg4 == 1) {
				method290(arg3, 4, arg2);
				method290(arg3 + 1, 64, arg2 + 1);
			}

			if (arg4 == 2) {
				method290(arg3, 16, arg2);
				method290(arg3 + 1, 1, arg2 - 1);
			}

			if (arg4 == 3) {
				method290(arg3, 64, arg2);
				method290(arg3 - 1, 4, arg2 - 1);
			}
		}

		if (arg0 == 2) {
			if (arg4 == 0) {
				method290(arg3, 130, arg2);
				method290(arg3 - 1, 8, arg2);
				method290(arg3, 32, arg2 + 1);
			}

			if (arg4 == 1) {
				method290(arg3, 10, arg2);
				method290(arg3, 32, arg2 + 1);
				method290(arg3 + 1, 128, arg2);
			}

			if (arg4 == 2) {
				method290(arg3, 40, arg2);
				method290(arg3 + 1, 128, arg2);
				method290(arg3, 2, arg2 - 1);
			}

			if (arg4 == 3) {
				method290(arg3, 160, arg2);
				method290(arg3, 2, arg2 - 1);
				method290(arg3 - 1, 8, arg2);
			}
		}

		if (arg1) {
			if (arg0 == 0) {
				if (arg4 == 0) {
					method290(arg3, 0x10000, arg2);
					method290(arg3 - 1, 4096, arg2);
				}

				if (arg4 == 1) {
					method290(arg3, 1024, arg2);
					method290(arg3, 16384, arg2 + 1);
				}

				if (arg4 == 2) {
					method290(arg3, 4096, arg2);
					method290(arg3 + 1, 0x10000, arg2);
				}

				if (arg4 == 3) {
					method290(arg3, 16384, arg2);
					method290(arg3, 1024, arg2 - 1);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg4 == 0) {
					method290(arg3, 512, arg2);
					method290(arg3 - 1, 8192, arg2 + 1);
				}

				if (arg4 == 1) {
					method290(arg3, 2048, arg2);
					method290(arg3 + 1, 32768, arg2 + 1);
				}

				if (arg4 == 2) {
					method290(arg3, 8192, arg2);
					method290(arg3 + 1, 512, arg2 - 1);
				}

				if (arg4 == 3) {
					method290(arg3, 32768, arg2);
					method290(arg3 - 1, 2048, arg2 - 1);
				}
			}

			if (arg0 == 2) {
				if (arg4 == 0) {
					method290(arg3, 66560, arg2);
					method290(arg3 - 1, 4096, arg2);
					method290(arg3, 16384, arg2 + 1);
				}

				if (arg4 == 1) {
					method290(arg3, 5120, arg2);
					method290(arg3, 16384, arg2 + 1);
					method290(arg3 + 1, 0x10000, arg2);
				}

				if (arg4 == 2) {
					method290(arg3, 20480, arg2);
					method290(arg3 + 1, 0x10000, arg2);
					method290(arg3, 1024, arg2 - 1);
				}

				if (arg4 == 3) {
					method290(arg3, 81920, arg2);
					method290(arg3, 1024, arg2 - 1);
					method290(arg3 - 1, 4096, arg2);
					return;
				}
			}
		}
	}

	@ObfuscatedName("KQTHKTBC.a(ZIIIIIZ)V")
	public void method289(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg0) {
			var7 += 0x20000;
		}

		arg4 -= field793;
		arg3 -= field794;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg5;
			arg5 = arg1;
			arg1 = var8;
		}

		for (int var9 = arg4; var9 < arg4 + arg5; var9++) {
			if (var9 >= 0 && var9 < field795) {
				for (int var10 = arg3; var10 < arg1 + arg3; var10++) {
					if (var10 >= 0 && var10 < field796) {
						method290(var9, var7, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("KQTHKTBC.a(IIIB)V")
	public void method290(int arg0, int arg1, int arg2) {
		field797[arg0][arg2] &= 0xFFFFFF - arg1;
	}

	@ObfuscatedName("KQTHKTBC.a(IZI)V")
	public void method291(int arg0, int arg1) {
		arg1 -= field793;
		arg0 -= field794;
		field797[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("KQTHKTBC.a(IIIIZII)Z")
	public boolean method292(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg2 && arg3 == arg5) {
			return true;
		}

		arg2 -= field793;
		arg5 -= field794;
		arg1 -= field793;
		arg3 -= field794;
		if (arg4 == 0) {
			if (arg0 == 0) {
				if (arg1 - 1 == arg2 && arg3 == arg5) {
					return true;
				}

				if (arg1 == arg2 && arg3 + 1 == arg5 && (field797[arg2][arg5] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg3 - 1 == arg5 && (field797[arg2][arg5] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg1 == arg2 && arg3 + 1 == arg5) {
					return true;
				}

				if (arg1 - 1 == arg2 && arg3 == arg5 && (field797[arg2][arg5] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 + 1 == arg2 && arg3 == arg5 && (field797[arg2][arg5] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg1 + 1 == arg2 && arg3 == arg5) {
					return true;
				}

				if (arg1 == arg2 && arg3 + 1 == arg5 && (field797[arg2][arg5] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg3 - 1 == arg5 && (field797[arg2][arg5] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg1 == arg2 && arg3 - 1 == arg5) {
					return true;
				}

				if (arg1 - 1 == arg2 && arg3 == arg5 && (field797[arg2][arg5] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 + 1 == arg2 && arg3 == arg5 && (field797[arg2][arg5] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 2) {
			if (arg0 == 0) {
				if (arg1 - 1 == arg2 && arg3 == arg5) {
					return true;
				}

				if (arg1 == arg2 && arg3 + 1 == arg5) {
					return true;
				}

				if (arg1 + 1 == arg2 && arg3 == arg5 && (field797[arg2][arg5] & 0x1280180) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg3 - 1 == arg5 && (field797[arg2][arg5] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg1 - 1 == arg2 && arg3 == arg5 && (field797[arg2][arg5] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg3 + 1 == arg5) {
					return true;
				}

				if (arg1 + 1 == arg2 && arg3 == arg5) {
					return true;
				}

				if (arg1 == arg2 && arg3 - 1 == arg5 && (field797[arg2][arg5] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg1 - 1 == arg2 && arg3 == arg5 && (field797[arg2][arg5] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg3 + 1 == arg5 && (field797[arg2][arg5] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 + 1 == arg2 && arg3 == arg5) {
					return true;
				}

				if (arg1 == arg2 && arg3 - 1 == arg5) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg1 - 1 == arg2 && arg3 == arg5) {
					return true;
				}

				if (arg1 == arg2 && arg3 + 1 == arg5 && (field797[arg2][arg5] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 + 1 == arg2 && arg3 == arg5 && (field797[arg2][arg5] & 0x1280180) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg3 - 1 == arg5) {
					return true;
				}
			}
		}

		if (arg4 == 9) {
			if (arg1 == arg2 && arg3 + 1 == arg5 && (field797[arg2][arg5] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg2 && arg3 - 1 == arg5 && (field797[arg2][arg5] & 0x2) == 0) {
				return true;
			}

			if (arg1 - 1 == arg2 && arg3 == arg5 && (field797[arg2][arg5] & 0x8) == 0) {
				return true;
			}

			if (arg1 + 1 == arg2 && arg3 == arg5 && (field797[arg2][arg5] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("KQTHKTBC.a(IIIIIII)Z")
	public boolean method293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg1 && arg2 == arg5) {
			return true;
		}

		arg1 -= field793;
		arg5 -= field794;
		arg0 -= field793;
		arg2 -= field794;
		if (arg4 == 6 || arg4 == 7) {
			if (arg4 == 7) {
				arg3 = arg3 + 2 & 0x3;
			}

			if (arg3 == 0) {
				if (arg0 + 1 == arg1 && arg2 == arg5 && (field797[arg1][arg5] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg2 - 1 == arg5 && (field797[arg1][arg5] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg0 - 1 == arg1 && arg2 == arg5 && (field797[arg1][arg5] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg2 - 1 == arg5 && (field797[arg1][arg5] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg0 - 1 == arg1 && arg2 == arg5 && (field797[arg1][arg5] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg2 + 1 == arg5 && (field797[arg1][arg5] & 0x20) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg0 + 1 == arg1 && arg2 == arg5 && (field797[arg1][arg5] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg2 + 1 == arg5 && (field797[arg1][arg5] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 8) {
			if (arg0 == arg1 && arg2 + 1 == arg5 && (field797[arg1][arg5] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg1 && arg2 - 1 == arg5 && (field797[arg1][arg5] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg1 && arg2 == arg5 && (field797[arg1][arg5] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg1 && arg2 == arg5 && (field797[arg1][arg5] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("KQTHKTBC.a(IZIIIIII)Z")
	public boolean method294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg2 + arg6 - 1;
		int var9 = arg0 + arg3 - 1;
		if (arg1 >= arg6 && arg1 <= var8 && arg4 >= arg0 && arg4 <= var9) {
			return true;
		}

		if (arg6 - 1 == arg1 && arg4 >= arg0 && arg4 <= var9 && (field797[arg1 - field793][arg4 - field794] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg1 && arg4 >= arg0 && arg4 <= var9 && (field797[arg1 - field793][arg4 - field794] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		}

		if (arg0 - 1 == arg4 && arg1 >= arg6 && arg1 <= var8 && (field797[arg1 - field793][arg4 - field794] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg4 && arg1 >= arg6 && arg1 <= var8 && (field797[arg1 - field793][arg4 - field794] & 0x20) == 0 && (arg5 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
